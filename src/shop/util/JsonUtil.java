package shop.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Primitives;

public class JsonUtil {

	private static Gson gson = new Gson();

	public static String toJson(Object data) {
		String str = gson.toJson(data);
		return str;
	}

	public static <T> T fromJson(String json, Class<T> classOfT) throws JsonSyntaxException {
		Object object = gson.fromJson(json, (Type) classOfT);
		return Primitives.wrap(classOfT).cast(object);
	}

	public static <T> List<T> toList(String json, Class<T> typeClass) {
		return gson.fromJson(json, new ListOfJson<T>(typeClass));
	}
}

class ListOfJson<T> implements ParameterizedType {
	private Class<?> wrapped;

	public ListOfJson(Class<T> wrapper) {
		this.wrapped = wrapper;
	}

	@Override
	public Type[] getActualTypeArguments() {
		return new Type[] { wrapped };
	}

	@Override
	public Type getRawType() {
		return List.class;
	}

	@Override
	public Type getOwnerType() {
		return null;
	}
}
