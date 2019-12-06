package shop.util;

import javax.servlet.http.HttpSession;

import shop.shoes.model.AccountDTO;

public class UserSessionUtil {
    public static final String USER_SESSION_KEY = "user";

    public static AccountDTO getUserFromSession(HttpSession session) {
        Object user = session.getAttribute(USER_SESSION_KEY);
        if (user == null) {
            return null;
        }
        return (AccountDTO) user;
    }

    public static boolean isLogined(HttpSession session) {
        if (getUserFromSession(session) == null) {
            return false;
        }
        return true;
    }
}
