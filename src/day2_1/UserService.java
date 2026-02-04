package day2_1;

import org.json.JSONArray;
import org.json.JSONObject;

public class UserService {

    private UserDao userDao = new UserDao();

    public void fetchUsersAndSave() {

        try {
            // 1️⃣ Call API
            String jsonResponse = ApiClient.getUsersJson();

            // 2️⃣ Parse JSON
            JSONArray usersArray = new JSONArray(jsonResponse);

            // 3️⃣ Convert & Save
            for (int i = 0; i < usersArray.length(); i++) {

                JSONObject obj = usersArray.getJSONObject(i);

                User user = new User();
                user.setId(obj.getInt("id"));
                user.setName(obj.getString("name"));
                user.setUsername(obj.getString("username"));
                user.setEmail(obj.getString("email"));
                user.setPhone(obj.getString("phone"));
                user.setWebsite(obj.getString("website"));

                userDao.saveUser(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
