package ticket;

import java.util.Arrays;

public class Row {

    public int[] seatNo;
    public String rowNo;

    public Row(String rowNo, int[] seatNo) {
        this.rowNo = rowNo;
        this.seatNo = seatNo;
    }

    @Override
    public String toString() {
        return "Row{" +
                "seatNo=" + Arrays.toString(seatNo) +
                ", rowNo='" + rowNo + '\'' +
                '}';
    }
}

