package com.company;

public class MyArrayList {
    private Integer iter = 0;

    private Integer[] array1;
    private String[] array2;
    private Boolean[] array3;
    private Float[] array4;
    private Double[] array5;

    ////////////КАЖДЫЙ ЗАСЛУЖИВАЕТ СВОЕГО КОНСТРУКТОРА

    public MyArrayList(Integer[] array) {

        if (array.length != 0) {
            int length = array.length;
            array1 = new Integer[length];
        }
        else array1 = new Integer[1];

        for (int i = 0; i < array.length; i++){
            array1[i] = array[i];
        }

    }

    public MyArrayList(String[] array) {

        if (array.length != 0) {
            int length = array.length;
            array2 = new String[length];
        }
        else array2 = new String[1];

        for (int i = 0; i < array.length; i++){
            array2[i] = array[i];
        }

    }

    public MyArrayList(Boolean[] array) {

        if (array.length != 0) {
            int length = array.length;
            array3 = new Boolean[length];
        }
        else array3 = new Boolean[1];

        for (int i = 0; i < array.length; i++){
            array3[i] = array[i];
        }

    }

    public MyArrayList(Float[] array) {

        if (array.length != 0) {
            int length = array.length;
            array4 = new Float[length];
        }
        else array4 = new Float[1];

        for (int i = 0; i < array.length; i++){
            array4[i] = array[i];
        }

    }
    public MyArrayList(Double[] array) {

        if (array.length != 0) {
            int length = array.length;
            array5 = new Double[length];
        }
        else array5 = new Double[1];

        for (int i = 0; i < array.length; i++){
            array5[i] = array[i];
        }

    }

    /////ВСЕ ПОЛУЧИЛИ СВОИ КОНСТРУКТОРЫ

    ////ФУНКЦИИ ДЛЯ ДОБАВЛЕНИЯ ЭЛЕМЕНТА В КАЖДЫЙ ТИП МАССИВА

    public void add(Integer a){
        Integer[] b = new Integer[iter+1];

        for (int i = 0; i < this.array1.length; i++){
            b[i] = this.array1[i];
        }

        b[iter] = a;

        this.array1 = new Integer[iter+1];

        for (int i = 0; i < b.length; i++){
            this.array1[i] = b[i];
        }

        iter++;
    }

    public void add(String a){
        String[] b = new String[iter+1];

        for (int i = 0; i < this.array2.length; i++){
            b[i] = this.array2[i];
        }

        b[iter] = a;

        this.array2 = new String[iter+1];

        for (int i = 0; i < b.length; i++){
            this.array2[i] = b[i];
        }

        iter++;
    }

    public void add(Boolean a){
        Boolean[] b = new Boolean[iter+1];

        for (int i = 0; i < this.array3.length; i++){
            b[i] = this.array3[i];
        }

        b[iter] = a;

        this.array3 = new Boolean[iter+1];

        for (int i = 0; i < b.length; i++){
            this.array3[i] = b[i];
        }

        iter++;
    }
    public void add(Float a){
        Float[] b = new Float[iter+1];

        for (int i = 0; i < this.array4.length; i++){
            b[i] = this.array4[i];
        }

        b[iter] = a;

        this.array4 = new Float[iter+1];

        for (int i = 0; i < b.length; i++){
            this.array4[i] = b[i];
        }

        iter++;
    }

    public void add(Double a){
        Double[] b = new Double[iter+1];

        for (int i = 0; i < this.array5.length; i++){
            b[i] = this.array5[i];
        }

        b[iter] = a;

        this.array5 = new Double[iter+1];

        for (int i = 0; i < b.length; i++){
            this.array5[i] = b[i];
        }

        iter++;
    }
    /////ФУНКЦИИ ДЛЯ ДОБАВЛЕНИЯ ГОТОВЫ

    ////ФУНКЦИИ ДЛЯ ПОИСКА ИНДЕКСА ПО ЭЛЕМЕНТУ

    public Integer findIndexOfIntegers(Integer a){
        Integer searched = 0;
        for (int i =0; i < this.array1.length; i++){
            if (this.array1[i].equals(a)){
                searched = i;
            }
        }
        return searched;
    }

    public Integer findIndexOfStrings(String a){
        Integer searched = 0;
        for (int i =0; i < this.array2.length; i++){
            if (this.array2[i].equals(a)){
                searched = i;
            }
        }
        return searched;
    }

    public Integer findIndexOfFirstBoolean(Boolean a){
        Integer searched = 0;
        for (int i =0; i < this.array3.length; i++){
            if (this.array3[i].equals(a)){
                searched = i;
            }
        }
        return searched;
    }

    public Integer findIndexOfFloats(Float a){
        Integer searched = 0;
        for (int i =0; i < this.array4.length; i++){
            if (this.array4[i].equals(a)){
                searched = i;
            }
        }
        return searched;
    }

    public Integer findIndexOfDoubles(Double a){
        Integer searched = 0;
        for (int i =0; i < this.array5.length; i++){
            if (this.array5[i].equals(a)){
                searched = i;
            }
        }
        return searched;
    }

    /////ФУНКЦИИ ДЛЯ УДАЛЕНИЯ ПОСЛЕДНЕГО ЭЛЕМЕНТА

    public void removeInteger(){
        Integer[] b = new Integer[iter-1];

        for (int i = 0; i < this.array1.length-1; i++){
            b[i] = this.array1[i];
        }

        this.array1 = new Integer[iter-1];

        for (int i = 0; i < b.length; i++){
            this.array1[i] = b[i];
        }

        iter--;
    }

    public void removeSrting(){
        String[] b = new String[iter-1];

        for (int i = 0; i < this.array2.length-1; i++){
            b[i] = this.array2[i];
        }

        this.array2 = new String[iter-1];

        for (int i = 0; i < b.length; i++){
            this.array2[i] = b[i];
        }

        iter--;
    }

    public void removeBoolean(){
        Boolean[] b = new Boolean[iter-1];

        for (int i = 0; i < this.array3.length-1; i++){
            b[i] = this.array3[i];
        }

        this.array3 = new Boolean[iter-1];

        for (int i = 0; i < b.length; i++){
            this.array3[i] = b[i];
        }

        iter--;
    }

    public void removeFloat(){
        Float[] b = new Float[iter-1];

        for (int i = 0; i < this.array4.length-1; i++){
            b[i] = this.array4[i];
        }

        this.array4 = new Float[iter-1];

        for (int i = 0; i < b.length; i++){
            this.array4[i] = b[i];
        }

        iter--;
    }

    public void removeDouble(){
        Double[] b = new Double[iter-1];

        for (int i = 0; i < this.array5.length-1; i++){
            b[i] = this.array5[i];
        }

        this.array5 = new Double[iter-1];

        for (int i = 0; i < b.length; i++){
            this.array5[i] = b[i];
        }

        iter--;
    }

    ////ФУНКЦИИ ДЛЯ ВЫВОДОВ ВСЕХ ЭЛЕМЕНТОВ НА ЭКРАН

    public void toMyStringIntegers() {
        for (int i = 0; i < this.array1.length; i++ ) {
            System.out.print(this.array1[i] + " ");
        }
    }

    public void toMyStringStrings() {
        for (int i = 0; i < this.array2.length; i++ ) {
            System.out.print(this.array2[i] + " ");
        }
    }


    public void toMyStringBooleans() {
        for (int i = 0; i < this.array3.length; i++ ) {
            System.out.print(this.array3[i] + " ");
        }
    }
    public void toMyStringFloats() {
        for (int i = 0; i < this.array4.length; i++ ) {
            System.out.print(this.array4[i] + " ");
        }
    }
    public void toMyStringDoubles() {
        for (int i = 0; i < this.array5.length; i++ ) {
            System.out.print(this.array5[i] + " ");
        }
    }
}
