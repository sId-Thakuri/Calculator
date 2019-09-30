package com.sid.calculator;

    public class Arithmatic {

        private int first;
        private int second;

        public int Add(){
            return first + second;
        }

        public int Subtract(){
            return first - second;
        }

        public int Divide(){
            return first / second;
        }

        public int Multiple(){
            return first * second;
        }


        public Arithmatic(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public void setFirst(int first) {
            this.first = first;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }
    }



