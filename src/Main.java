 class Libro {
    private String author;
    private String isbn;
    private String title;
    private String editorial;

     public String getAuthor() {
         return author;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public String getIsbn() {
         return isbn;
     }

     public void setIsbn(String isbn) {
         this.isbn = isbn;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getEditorial() {
         return editorial;
     }

     public void setEditorial(String editorial) {
         this.editorial = editorial;
     }
 }

 class Usuario {
     private String name;
     private String clave;
     private String phone;
     private String email;
     private String address;
     private String registerDate;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getClave() {
         return clave;
     }

     public void setClave(String clave) {
         this.clave = clave;
     }

     public String getPhone() {
         return phone;
     }

     public void setPhone(String phone) {
         this.phone = phone;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public String getRegisterDate() {
         return registerDate;
     }

     public void setRegisterDate(String registerDate) {
         this.registerDate = registerDate;
     }
 }

 class Empleado {
     private String name;
     private String clave;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getClave() {
         return clave;
     }

     public void setClave(String clave) {
         this.clave = clave;
     }
 }

 class Prestamo {
     private String fechahora;
     private Usuario usuario;
     private Libro[] libros;
     private Empleado empleado;

     public String getFechahora() {
         return fechahora;
     }

     public void setFechahora(String fechahora) {
         this.fechahora = fechahora;
     }

     public Usuario getUsuario() {
         return usuario;
     }

     public void setUsuario(Usuario usuario) {
         this.usuario = usuario;
     }

     public Libro[] getLibros() {
         return libros;
     }

     public void setLibros(Libro[] libros) {
         this.libros = libros;
     }

     public Empleado getEmpleado() {
         return empleado;
     }

     public void setEmpleado(Empleado empleado) {
         this.empleado = empleado;
     }
 }
 class AdministadorDeUsuarios {
     public String clave;
 }
 class AdministadorDeLibros {
     public String clave;
 }
 class AdministadorDePrestamos {
     public Empleado empleado;
     public Usuario usuario;
     public Libro []libros;
 }

 public class Main{
     public static void main(String[] args) {
     }
}