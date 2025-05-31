package com.softserve.academy.finalProject;

public class Cinema {
    private int rows;
    private int seatsInRow;
    private String[][] seats;

    public Cinema(int rows, int seatsInRow) {
        this.rows = rows;
        this.seatsInRow = seatsInRow;
        seats = new String[rows][seatsInRow];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsInRow; j++) {
                seats[i][j] = "S";
            }
        }
    }

    public void printSeats() {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= seatsInRow; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < seatsInRow; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int ticketPrice(int rowNumber) {
        int total = rows * seatsInRow;
        if (rows > 0 && seatsInRow > 0) {
            if (total < 60) {
                return 10;
            } else {
                return rowNumber > rows / 2 ? 8 : 10;
            }
        }
        return -1;
    }

    public static int totalCalculateIncome(int rows, int seatsInRow) {
        int total = rows * seatsInRow;
        if (total < 60) {
            return total * 10;
        } else {
            int frontHalf = rows / 2;
            int backHalf = rows - frontHalf;
            return frontHalf * seatsInRow * 10 + backHalf * seatsInRow * 8;
        }
    }

    public boolean isSeatTaken(int row, int seat) {
        return seats[row - 1][seat - 1].equals("B");
    }

    public boolean isValidSeat(int row, int seat) {
        return row >= 1 && row <= rows && seat >= 1 && seat <= seatsInRow;
    }

    public void bookSeat(int row, int seatsInRow) {
        seats[row - 1][seatsInRow - 1] = "B";
    }


    public void printStatistics() {
        int purchasedTickets = purchasedTickets();
        System.out.println("Number of purchased tickets: " + purchasedTickets);
        double percentage = percentage(purchasedTickets);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        int currentIncome = currentCalculateIncome();
        System.out.println("Current income: $" + currentIncome);
        int totalIncome = totalCalculateIncome(rows, seatsInRow);
        System.out.println("Total income: $" + totalIncome);

    }

    private int currentCalculateIncome() {
        int currentIncome = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsInRow; j++) {
                if (seats[i][j].equals("B")) {
                    currentIncome += ticketPrice(i + 1);
                }
            }
        }
        return currentIncome;
    }

    private int purchasedTickets() {
        int purchasedTickets = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsInRow; j++) {
                if (seats[i][j].equals("B")) {
                    purchasedTickets++;
                }
            }
        }
        return purchasedTickets;
    }

    private double percentage(int purchasedTickets) {
        return (purchasedTickets * 100.0) / (rows * seatsInRow);
    }
}
