public class CheckCar {
    String checkXeHoi(){
        String temp = null;
        String[] arr =new String[]{"BMW","Ford","Toyota","Suzuki","Audi"};
        for ( int i =0; i< arr.length;i++)
        {
            for ( int j= i+1;j< arr.length;j++){
                if ( arr[i].compareTo(arr[j])>0){
                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println("Các chuỗi sau khi sắp xếp là: ");
        for (int i = 0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    return temp;
    }
}
