public class ExMain {
    public String frontTimes(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i= i+1){
            result = result + str;
        }
        return result;
    }
    public String endUp(String str) {
        if (str.length()<=3){
            return str.toUpperCase();
        }
        int cut = str.length() - 3;
        String first = str.substring(0,cut);
        String last = str.substring(cut);
        return first + last.toUpperCase();
    }
    public int what(){
        int a = 10%3;
        return a;
    }
    public boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }
    public boolean stringE(String str) {
        int count = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }
        return (count >= 1 && count <= 5);
    }
    public int max1020(int a, int b) {
        if(a>b){
            int temp = b;
            b=a;
            a=temp;
        }
        if (b >= 10 && b <= 20) return b;
        if (a >= 10 && a <= 20) return a;

        return 0;
    }

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 50 && b >= 30 && b <= 50) {
            return true;
        }
        return false;
    }
    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);
        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }
    public int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public String startOz(String str) {
        String result= "";
        if (str.length()>=1 && str.charAt(0) == 'o'){
            result= result + str.charAt(0);
        }
        if (str.length()>=2 && str.charAt(1) == 'z'){
            result = result + str.charAt(1);
        }
        return result;
    }

    public String everyNth(String str, int n) {
        String result ="";
        for(int i = 0; i<str.length(); i = i+n){
            result = result + str.charAt(i);
        }
        return result;
    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        String two = str.substring(1, 3);
        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args){
      ExMain exMain = new ExMain();
      exMain.frontTimes("abcd",2);
      exMain.stringTimes("ab",4);
      System.out.println(exMain.endUp("lore"));
      System.out.println(exMain.lastDigit(6,16));
      System.out.println(exMain.lastDigit(5,16));
      System.out.println(exMain.what());
      exMain.stringE("acd");
      exMain.max1020(2,1);
      exMain.in3050(2,6);
      exMain.close10(7,9);
      exMain.intMax(2,3,8);
      exMain.intMax(10,5,2);
      exMain.startOz("ozgfgf");
      exMain.startOz("opgfgf");
      exMain.startOz("ezgfgf");
      exMain.startOz("pigfgf");
      exMain.everyNth("Miracle", 2);
      exMain.sleepIn(false, false);
      exMain.mixStart("aixdefghij");
    }

}
