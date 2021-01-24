package Raduga;

public class RadugaRun {

        public static void main(String[] args) {
            Red red = new Red();
            System.out.println (red);
            Orange orange = new Orange();
            System.out.println (orange);
            Yellow yellow = new Yellow();
            System.out.println (yellow);
            Green green = new Green();
            System.out.println (green);
            Blue blue = new Blue();
            System.out.println (blue);
            Indigo a = new Indigo();
            System.out.println (a);
            Violet violet = new Violet();
            System.out.println (violet);//напишите тут ваш код

        }

        public static class Red {
            public Red() {
                System.out.println("Red");
            }
        }

        public static class Orange {
            public Orange() {
                System.out.println("Orange");
            }
        }

        public static class Yellow {
            public Yellow() {
                System.out.println("Yellow");
            }
        }

        public static class Green {
            public Green() {
                System.out.println("Green");
            }
        }

        public static class Blue {
            public Blue() {
                System.out.println("Blue");
            }
        }

        public static class Indigo {
            public Indigo() {
                System.out.println("Indigo");
            }
        }

        public static class Violet {
            public Violet() {
                System.out.println("Violet");
            }
        }
    }

