public class Util {
        public static void Wait(int time){
            time=time*1000;
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
