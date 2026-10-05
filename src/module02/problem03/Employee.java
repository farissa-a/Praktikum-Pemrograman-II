package module02.problem03;

//Pada baris ini terjadi error karena nama class public harus sama dengan nama file (Employee.java)
//public class Pegawai {
public class Employee {
    public String name;
    //Pada baris ini terjadi error karena tipe char hanya bisa menyimpan satu karakter, sedangkan asal berupa teks
    //public char origin;
    public String origin;
    public String role;
    //Pada baris ini umur tidak pernah diisi sehingga tercetak 0, padahal output yang diminta 17
    //public int age;
    public int age = 17;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    //Pada baris ini terjadi error karena method dipanggil dengan satu argumen, tapi belum punya parameter (variabel r juga belum dideklarasikan)
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}