
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Đặng Cường
 */
public class J03022_XuLyVanBan {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        String res = "";
        while (s.hasNext()) {
            res += s.next().toLowerCase() + " ";
        }
        res = res.replaceAll("\\s*\\?\\s*", "\\. ");
        res = res.replaceAll("\\s*\\!\\s*", "\\. ");
        res = res.replaceAll("\\s*\\:\\s*", "\\: ");
        res = res.replaceAll("\\s*\\,\\s*", "\\, ");
        res = res.replaceAll("\\s*\\.\\s*", "\\. ");
        res = Character.toUpperCase(res.charAt(0)) + res.substring(1, res.length());
        for (int i = 0; i < res.length(); i++) {
            if (i < res.length() - 2) {
                if (res.charAt(i) == '.') {
                    res = res.substring(0, i + 2) + Character.toUpperCase(res.charAt(i + 2)) + res.substring(i + 3, res.length());
                }
            }
        }
        String b[] = res.split("\\. ");
        for (String i : b) {
            System.out.println(i);
        }
    }
}
