package rmutsb.mook.chatchon.makingfavorcoffee.ultility;

/**
 * Created by masterung on 30/10/2017 AD.
 */

public class MyConstant {

    private String urlPostUserString = "http://androidthai.in.th/nut/addUserNut.php";
    private String urlGetUserString = "http://androidthai.in.th/nut/getAllDataNut.php";

    private String[] columnUserStrings = new String[]{"user_id", "user_Name",
            "user_Surname", "user_Phone", "user_Email", "user_Password"};

    public String[] getColumnUserStrings() {
        return columnUserStrings;
    }

    public String getUrlGetUserString() {
        return urlGetUserString;
    }

    public String getUrlPostUserString() {
        return urlPostUserString;
    }
}
