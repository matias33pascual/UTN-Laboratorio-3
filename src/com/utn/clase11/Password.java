package com.utn.clase11;

public class Password implements Comparable<Password>{
    private int size;
    private String password;

    public Password(){
        this.size = 8;
        this.generar_password(8);
    }

    public Password(int size) {
        this.size = size;
        this.generar_password(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        generar_password(size);
    }

    public String getPassword() {
        return password;
    }

    private void generar_password(int size){
        String AlphaNumerico = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder new_pass = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int index
                    = (int)(AlphaNumerico.length()
                    * Math.random());
            new_pass.append(AlphaNumerico
                    .charAt(index));
        }
        this.password = new_pass.toString();
    }

    public boolean esFuerte(){
        int cant_min = 0;
        int cant_may = 0;
        int cant_num = 0;
        for (char ch: password.toCharArray()) {
            if (Character.isLowerCase(ch)){
                cant_min += 1;
            }
            else if(Character.isUpperCase(ch)){
                cant_may += 1;
            }
            else { cant_num += 1; }
        }
        if (cant_may > 2 && cant_min > 1 && cant_num > 5) {
            return true;
        }
        else { return false; }
    }

    @Override
    public String toString() {
        return "Password{" +
                "size=" + size +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public int compareTo(Password pass_object) {
        int result = password.compareTo(pass_object.getPassword());
        return result;
    }
}
