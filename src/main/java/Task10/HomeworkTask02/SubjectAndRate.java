package Task10.HomeworkTask02;

public class SubjectAndRate {
        private Subject subject;
        private int rate;

        public SubjectAndRate(Subject subject  , int rate) {
            this.subject = subject;
            this.rate = rate;
        }

        public int getRate() {
            return rate;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }

    @Override
    public String toString() {
        return "{Subject=" + subject +
                ", rate=" + rate +
                '}';
    }
}

