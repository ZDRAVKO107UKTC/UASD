public class Utils {
    public static void BS_FF(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int wh_arr = 0; wh_arr < n - 1; wh_arr++) {
            swapped = false;
            for (int el_by_el = 0; el_by_el < n - wh_arr - 1; el_by_el++){
                if (arr[el_by_el] > arr[el_by_el + 1]){
                    int temporary_el = arr[el_by_el];
                    arr[el_by_el] = arr[el_by_el + 1];
                    arr[el_by_el + 1] = temporary_el;
                    swapped = true;
                }//end of if
            }//end of for
            if (!swapped) {
                break;
            }//end of if

        }//end of for


    }//end of BS_FF

    public static void BS_WD(int[] arr) {
        int n = arr.length;
        boolean swapped;
        int whole_arr = 0;
        do {
            swapped = false;
            for (int el_by_el = 0; el_by_el < n - whole_arr - 1; el_by_el++) {
                if (arr[el_by_el] > arr[el_by_el + 1]) {
                    int temporary_el = arr[el_by_el];
                    arr[el_by_el] = arr[el_by_el + 1];
                    arr[el_by_el + 1] = temporary_el;
                    swapped = true;
                }//end of if
            }//end of for


            whole_arr++;//increment whole arr counter


        } while (!swapped && whole_arr < n - 1 );





    }}//end of BS_WD