class Calculator{
    public void display(){
        System.out.println("QUADRATIC FORMULA"); //QUADDRATIC FORMULA
        int q_a = 1, q_b = 5, q_c = 6;
        Pair q_ans = quadraticFormula(q_a, q_b, q_c);
        System.out.println("The solutions for " + q_a + "x^2 + " + q_b + "x + " + q_c + " are " + q_ans.x + " and " + q_ans.y + ".\n"); //output
        System.out.println("SLOPE FORMULA"); //SlOPE FORMULA
        int s_1x = 0, s_1y = 0, s_2x = 2, s_2y = 3; //variables needed for calculatoin: x of point 1, y of point 1, x of point 2, y of point 2
        double s_ans = slopeFormula(s_1x, s_1y, s_2x, s_2y);
        System.out.println("A line connecting the points (" + s_1x + ", " + s_1y + ") and (" + s_2x + ", " + s_2y + ") has a slope of " + s_ans + "\n"); //output
        System.out.println("MIDPOINT FORMULA"); //MIDPOINT FORMULA
        int m_1x = 0, m_1y = 0, m_2x = 2, m_2y = 3; //variables needed for calculatoin: x of point 1, y of point 1, x of point 2, y of point 2
        Pair m_ans = midpointFormula(m_1x,  m_1y, m_2x, m_2y);
        System.out.println("The midpoint between (" + m_1x + ", " + m_1y + ") and (" + m_2x + ", " + m_2y + ") is (" + m_ans.x + ", " + m_ans.y + ")\n"); //output
        System.out.println("SUM OF ARITHMETIC SERIES"); //SUM OF ARITHMETIC SERIES
        int a_num = 5; //variables needed for calculatoin: number of terms
        double a_sta = 1.0, a_inc = 1.0; //variables needed for calculatoin: starting number, increment
        double a_sum = sumOfArithmeticSeries(a_num, a_sta, a_inc); //calculation using the SUM OF ARITHMETIC SERIES FORMULA
        System.out.println("The sum of the first " + a_num + " terms of an arithmetic series that starts with " + a_sta + " and increases by " + a_inc + " is " + a_sum + "\n"); //output
        System.out.println("SUM OF FINITE GEOMETRIC SERIES"); //SUM OF FINITE GEOMETRIC SERIES
        int g_num = 3; //variables needed for calculatoin: number of terms
        double g_sta = 3.0, g_rat = 2.0; //variables needed for calculatoin: starting number, increment
        double g_sum = sumOfFiniteGeometricSeries(g_num, g_sta, g_rat); //calculation using the SUM OF FINITE GEOMETRIC SERIES FORMULA
        System.out.println("The sum of the first " + g_num + " terms of a finite geometric series that starts with " + g_sta + " and increases by a rate of " + g_rat + " is " + g_sum); //output
    }
    Pair quadraticFormula(int a, int b, int c){ //method for calculating QUADDRATIC FORMULA
        return new Pair((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a), (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
    }
    double slopeFormula(int x1, int y1, int x2, int y2){ //method for calculating QUADDRATIC FORMULA
        return (double)(y2 - y1) / (x2 - x1);
    }
    Pair midpointFormula(int x1, int y1, int x2, int y2){ //method for calculating SlOPE FORMULA
        return new Pair((double)(x1 + x2) / 2, (double)(y1 + y2) / 2);
    }
    double sumOfArithmeticSeries(int num, double sta, double inc){ //method for calculating SUM OF ARITHMETIC SERIES
        return (num / 2.0) * (sta + sta + (num-1) * inc);
    }
    double sumOfFiniteGeometricSeries(int num, double sta, double rat){ //method for calculating SUM OF FINITE GEOMETRIC SERIES
        return sta * (1 - Math.pow(rat, num)) / (1 - rat);
    }
}