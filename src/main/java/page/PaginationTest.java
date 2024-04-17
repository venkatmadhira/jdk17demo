package page;

import java.util.List;

public class PaginationTest {
    public static void main(String[] args) {
        DataService dataService = new DataService();
        Pagination pagination = new Pagination();
        pagination.perPageRecordSize=10;
        List<String> names = dataService.getNames();
        if (names.size() % 10 > 0) {
            pagination.totalPages=names.size()/10+1;
        }else{
            pagination.totalPages=names.size()/10;

        }
        for( int i=0;i< pagination.totalPages;i++){
            int endIndex=(i*pagination.perPageRecordSize)+pagination.perPageRecordSize;
            if(endIndex> names.size()){
                endIndex= names.size();
            }
            List<String> stringList=names.subList(i*pagination.perPageRecordSize,
                    endIndex);
            System.out.println("Page No:"+i  +stringList);
        }

    }
}
