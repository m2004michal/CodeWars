package CodeWars.TakeTenMinuteWalk;


public class TenMinWalk {
    private static boolean isValid(char[] walk) {
        int h = 0;
        int v = 0;
        if(walk.length == 10){
            for (char c : walk) {
                switch (c){
                    case 'n':
                        h++;
                        break;
                    case 's':
                        h--;
                        break;
                    case 'e':
                        v++;
                        break;
                    case 'w':
                        v--;
                        break;
                }
            }
        }else return false;
        return h == 0 && v == 0;
    }

    public static void main(String[] args) {

        System.out.println(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
    }
}
