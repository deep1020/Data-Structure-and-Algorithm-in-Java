package String;

public class compare_version_number {
    static int compareVersion(String version1,String version2){
        String str1[] = version1.split("\\.");
        String str2[] = version2.split("\\.");
        int max = Math.max(str1.length, str2.length);
        for (int i = 0; i < max; i++) {
            int num1 = i >= str1.length ? 0 : Integer.parseInt(str1[i]);
            int num2 = i >= str2.length ? 0 : Integer.parseInt(str2[i]);
            System.out.println(num1);
            System.out.println(num2);
            if (num1 < num2) {
                return -1;
            }
            if (num1 > num2) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String version1="1.01";
        String version2="1.001";
        int result=compareVersion(version1,version2);
        System.out.println(result);
    }
}
