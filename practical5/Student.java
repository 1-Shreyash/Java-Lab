class Student{
    String Name;
    double Cgpa;
    String EnNum, Password;
    boolean isCgpaValid(double c){
        if(Cgpa>=0.0 && Cgpa<=10.0){
            return true;
        }
        return false;
    }
    boolean isEnrlValid(String e){
        char[] arr = e.toCharArray();
        int flag1=0, flag2=0, flag3=0, flag4=0;
        if(arr[0]=='B' && arr[1]=='E'){
            flag1 = 1;
        }
        if(arr[2]=='2'){
            if(arr[3]=='0' || arr[3]=='1' || arr[3]=='2' || arr[3]=='3'){
                flag2 = 1;
            }
        }
        if((arr[4]=='C' && arr[5]=='S' && arr[6]=='U') || (arr[4]=='E' && arr[5]=='N' && arr[6]=='U') || (arr[4]=='E' && arr[5]=='C' && arr[6]=='U') || (arr[4]=='E' && arr[5]=='E' && arr[6]=='U') ){
            flag3 = 1;
        }
        // if(arr[7]=='0' || arr[7]=='1' || arr[7]=='3'){
        //     if(arr[7]=='0' || arr[7]=='1'){
        //         if(arr[8]>='0' && arr[8]<='9' && arr[9]>='0' && arr[9]<='9')
        //             flag4 = 1;
        //     }
        //     else{
        //         if(arr[8]>='0' && arr[])
        //     }
        // }
        String s1 = e.substring(7, 10);
        int s2 = Integer.parseInt(s1);
        if(s2>=0 && s2<=250){
            flag4 = 1;
        }
        if((flag1*flag2*flag3*flag4)==1)
            return true;
        else
            return false;
    }
    boolean isPassWordValid(String password){//Password Validation code is still incomplete
        // for( int i=0;i<10;i++){
        //     int t = s.nextInt();
        //     checkInput(t);
        //     a[i] = t;
        // }
        int flag1=0, flag2=0, flag3=0, flag4=0;
        if(password.length() < 8){
            flag1 = 1;
        }
        char[] Ch = password.toCharArray();
        for(int i=0; i < password.length(); i++){
            if(Ch[i]>='A' && Ch[i]>='Z'){
                flag2 = 1;
                break;
            }
        }
        for(int i=0; i < password.length(); i++){
            if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                flag3 = 1;
                break;
            }
        }
        for(int i=  0; i < password.length(); i++){
            if(password.charAt(i) == '!' && password.charAt(i) == '$' && password.charAt(i) == '%' && password.charAt(i) == '*' && password.charAt(i) == '&'){
                flag4 = 1;
                break;
            }
        }
        if(flag1 == 1 && flag2 == 1 && flag3 ==1 && flag4 ==1){
            return true;
        }
        return false;
    }
    Student(String name, double cgpa, String ennum, String password){
        // if(!(isEnrlValid(ennum)))
        Name = name;
        Cgpa = cgpa;
        EnNum = ennum; 
        Password = password;
    }

}
