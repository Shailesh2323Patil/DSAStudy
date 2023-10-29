package Strivers.string.Medium;

public class CompareVersions {
    public static void main(String[] args) {
//      String version1 = "1.01";
//      String version2 = "1.001";

        String version1 = "1.0";
        String version2 = "1.0.1";

        System.out.println("Version Comparison : "+compareVersion(version1, version2));
    }

    public static int compareVersion(String version1, String version2) {
        String[] arrVersion1 = version1.split("\\.");
        String[] arrVersion2 = version2.split("\\.");

        for (int i = 0; i < Math.max(arrVersion1.length, arrVersion2.length); i++) {
            if(i >= arrVersion1.length && i <= arrVersion2.length) {
                if(Integer.parseInt(arrVersion2[i]) > 0) {
                    return -1;
                }
            }
            else if(i >= arrVersion2.length && i <= arrVersion1.length) {
                if(Integer.parseInt(arrVersion1[i]) > 0) {
                    return 1;
                }
            }
            else {
                if(Integer.parseInt(arrVersion1[i]) > Integer.parseInt(arrVersion2[i])) {
                    return 1;
                }
                else if(Integer.parseInt(arrVersion1[i]) < Integer.parseInt(arrVersion2[i])) {
                    return -1;
                }
            }
        }

        return 0;
    }
}
