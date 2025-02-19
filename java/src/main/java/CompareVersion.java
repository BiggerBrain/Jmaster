public class CompareVersion {
    public static int compareVersion(String leftVersion, String rightVersion) {
        String[] leftVersions = leftVersion.split("\\.");
        String[] rightVersions = rightVersion.split("\\.");
        if (rightVersions.length < 3 || leftVersions.length < 3) {
            throw new IllegalArgumentException("The version is invalid");
        }
        if (Integer.parseInt(leftVersions[0]) > Integer.parseInt(rightVersions[0])) {
            return 1;
        } else if (Integer.parseInt(leftVersions[0]) < Integer.parseInt(rightVersions[0])) {
            return -1;
        } else {
            if (Integer.parseInt(leftVersions[1]) > Integer.parseInt(rightVersions[1])) {
                return 1;
            } else if (Integer.parseInt(leftVersions[1]) < Integer.parseInt(rightVersions[1])) {
                return -1;
            } else {
                if (Integer.parseInt(leftVersions[2]) > Integer.parseInt(rightVersions[2])) {
                    return 1;
                } else if (Integer.parseInt(leftVersions[2]) < Integer.parseInt(rightVersions[2])) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("0.10.2", "1.0.0"));
    }
}
