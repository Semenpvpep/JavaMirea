public class Human {
    class Head {
        public void talk(String message) {
            System.out.println("Голова говорит: " + message);
        }
    }

    class Leg {
        private String side;

        public Leg(String side) {
            this.side = side;
        }

        public void walk() {
            System.out.println(side + " нога идет.");
        }
    }

    class Hand {
        private String side;
        private boolean raised;

        public Hand(String side) {
            this.side = side;
            this.raised = false;
        }

        public void raise() {
            raised = true;
            System.out.println(side + " рука поднята.");
        }

        public void lower() {
            raised = false;
            System.out.println(side + " рука опущена.");
        }

        public static void main(String[] args) {
            Human person = new Human();
            person.speak("Привет, мир!");
            person.walk();
            person.raiseLeftHand();
            person.raiseRightHand();
            person.lowerLeftHand();
            person.lowerRightHand();
        }
    }
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human() {
        head = new Head();
        leftLeg = new Leg("left");
        rightLeg = new Leg("right");
        leftHand = new Hand("left");
        rightHand = new Hand("right");
    }

    public void speak(String message) {
        head.talk(message);
    }

    public void walk() {
        leftLeg.walk();
        rightLeg.walk();
    }

    public void raiseLeftHand() {
        leftHand.raise();
    }

    public void raiseRightHand() {
        rightHand.raise();
    }

    public void lowerLeftHand() {
        leftHand.lower();
    }

    public void lowerRightHand() {
        rightHand.lower();
    }

    public static void main(String[] args) {
        Human person = new Human();
        person.speak("Привет, мир!");
        person.walk();
        person.raiseLeftHand();
        person.raiseRightHand();
        person.lowerLeftHand();
        person.lowerRightHand();
    }
}

