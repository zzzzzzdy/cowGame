public class Compare {

    private int[] how_cow;
    private int[] cow_total;
    private int[] cow_havecow;
    private int[] cow_iscow;
    private int[] cow_isfourflowers;
    private int[] cow_isfiveflowers;
    private int n;
    static int i = 0;

    public Compare( int[] howCow, int[] cowTotal, int[] cowHaveCow, int[] cowIsCow, int[] cowIsFourFlowers, int[] cowIsFiveFlowers, int n1) {

        how_cow = howCow;
        cow_total = cowTotal;
        cow_havecow = cowHaveCow;
        cow_iscow = cowIsCow;
        cow_isfourflowers = cowIsFourFlowers;
        cow_isfiveflowers = cowIsFiveFlowers;
        n = n1;

    }

    public int theWinner(int k) {
        int b = 0;
        i++;
        if (i < n-1) {
            if (cow_isfiveflowers[k] == cow_isfiveflowers[i] && cow_isfiveflowers[k] == 1) {
                if (cow_total[k] > cow_total[i])
                    return theWinner(k);
                else
                    return theWinner(i);
            }
            if (cow_isfiveflowers[k] > cow_isfiveflowers[i])
                return theWinner(k);
            if (cow_isfiveflowers[k] < cow_isfiveflowers[i])
                return theWinner(i);
            if (cow_isfiveflowers[k] == 0 && cow_isfiveflowers[i] == 0) {
                if (cow_isfourflowers[k] == cow_isfourflowers[i] && cow_isfourflowers[k] == 1) {
                    if (cow_total[k] > cow_total[i])
                        return theWinner(k);
                    else
                        return theWinner(i);
                }
                if (cow_isfourflowers[k] > cow_isfourflowers[i])
                    return theWinner(k);
                if (cow_isfourflowers[k] < cow_isfourflowers[i])
                    return theWinner(i);
                if (cow_isfourflowers[k] == 0 && cow_isfourflowers[i] == 0) {
                    if (cow_iscow[k] == cow_iscow[i] && cow_iscow[k] == 1) {
                        if (cow_total[k] > cow_total[i])
                            return theWinner(k);
                        else
                            return theWinner(i);
                    }
                    if (cow_iscow[k] > cow_iscow[i])
                        return theWinner(k);
                    if (cow_iscow[k] < cow_iscow[i])
                        return theWinner(i);
                    if (cow_iscow[k] == 0 && cow_iscow[i] == 0) {
                        if (cow_havecow[k] == cow_havecow[i] && cow_havecow[k] == 1) {
                            if (how_cow[k] > how_cow[i]) {
                                return theWinner(k);
                            } else if (how_cow[k] < how_cow[i]) {
                                return theWinner(i);
                            } else {
                                if (cow_total[k] > cow_total[i])
                                    return theWinner(k);
                                else
                                    return theWinner(i);
                            }
                        }
                        if (cow_havecow[k] > cow_havecow[i])
                            return theWinner(k);
                        if (cow_havecow[k] < cow_havecow[i])
                            return theWinner(i);
                        if (cow_havecow[k] == 0 && cow_havecow[i] == 0) {
                            if (cow_total[k] > cow_total[i])
                                return theWinner(k);
                            else
                                return theWinner(i);
                        }
                    }
                }
            }


        } else {
            if (cow_isfiveflowers[k] == cow_isfiveflowers[i] && cow_isfiveflowers[k] == 1) {
                if (cow_total[k] > cow_total[i])
                    b = k;
                else
                    b = i;
            }
            if (cow_isfiveflowers[k] > cow_isfiveflowers[i])
                b = k;
            if (cow_isfiveflowers[k] < cow_isfiveflowers[i])
                b = i;
            if (cow_isfiveflowers[k] == 0 && cow_isfiveflowers[i] == 0) {
                if (cow_isfourflowers[k] == cow_isfourflowers[i] && cow_isfourflowers[k] == 1) {
                    if (cow_total[k] > cow_total[i])
                        b = k;
                    else
                        b = i;
                }
                if (cow_isfourflowers[k] > cow_isfourflowers[i])
                    b = k;
                if (cow_isfourflowers[k] < cow_isfourflowers[i])
                    b = i;
                if (cow_isfourflowers[k] == 0 && cow_isfourflowers[i] == 0) {
                    if (cow_iscow[k] == cow_iscow[i] && cow_iscow[k] == 1) {
                        if (cow_total[k] > cow_total[i])
                            b = k;
                        else
                            b = i;
                    }
                    if (cow_iscow[k] > cow_iscow[i])
                        b = k;
                    if (cow_iscow[k] < cow_iscow[i])
                        b = i;
                    if (cow_iscow[k] == 0 && cow_iscow[i] == 0) {
                        if (cow_havecow[k] == cow_havecow[i] && cow_havecow[k] == 1) {
                            if (how_cow[k] > how_cow[i]) {
                                b = k;
                            } else if (how_cow[k] < how_cow[i]) {
                                b = i;
                            } else {
                                if (cow_total[k] > cow_total[i])
                                    b = k;
                                else
                                    b = i;
                            }
                            if (cow_havecow[k] > cow_havecow[i])
                                b = k;
                            if (cow_havecow[k] < cow_havecow[i])
                                b = i;
                            if (cow_havecow[k] == 0 && cow_havecow[i] == 0) {
                                if (cow_total[k] > cow_total[i])
                                    b = k;
                                else
                                    b = i;
                            }
                        }
                    }
                }

            }


        }
        return b;
    }

}
