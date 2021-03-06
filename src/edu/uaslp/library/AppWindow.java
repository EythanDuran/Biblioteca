package edu.uaslp.library;
import edu.uaslp.library.model.Empleado;
import edu.uaslp.library.model.Libro;
import edu.uaslp.library.model.Prestamo;
import edu.uaslp.library.model.Usuario;
import edu.uaslp.library.service.AdministradorDeLibro;
import edu.uaslp.library.service.AdministradorDePrestamo;
import edu.uaslp.library.service.AdministradorDeUsuario;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import javax.swing.*;

public class AppWindow {
    private static final int WIDTH = 700;
    private static final int HEIGHT = 600;
    private JLabel studentNameLabel;
    private JLabel bookNameLabel;
    private AdministradorDeUsuario AdminU =new AdministradorDeUsuario();
    private AdministradorDeLibro AdminL=new AdministradorDeLibro();
    private JTextField userKey;
    private  JTextField bookKey;
    private  DefaultListModel<String>modelLibro=new DefaultListModel<>();
    private Prestamo prestamoActual=new Prestamo();


    public void show() {
        JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        addStudentControls(panel);
        addBookContents(panel);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.weighty = 0.05;
        constraints.gridy = 4;
        panel.add(new JSeparator(SwingConstants.VERTICAL), constraints);

        addListOfLoans(panel);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridy = 6;
        constraints.ipady = 20;
        Button prestarBtn = new Button("Prestar");
        prestarBtn.addActionListener(this::performLoan);
        panel.add(prestarBtn, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.gridy = 7;
        panel.add(new JSeparator(SwingConstants.VERTICAL), constraints);

        frame.add(panel);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void addListOfLoans(JPanel panel) {

        JList<String> list = new JList<>(modelLibro); //data has type Object[]
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);

        list.setVisibleRowCount(-1);
        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(250, 80));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridy = 5;
        panel.add(listScroller, constraints);
    }

    private void addBookContents(JPanel panel) {
        JLabel labelBookKey = new JLabel("Clave del libro: ");
        JPanel firstRow = new JPanel();
        firstRow.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        bookKey = new JTextField();

        constraints.gridx = 0;
        firstRow.add(labelBookKey, constraints);

        constraints.gridx = 1;
        firstRow.add(bookKey, constraints);

        constraints.gridx = 2;
        JButton buttonKeyQuery = new JButton("Consultar libro");
        buttonKeyQuery.addActionListener(this::queryBook);
        firstRow.add(buttonKeyQuery, constraints);

        constraints.gridx = 3;
        JButton buttonKeyAdd = new JButton("Agregar");
        buttonKeyAdd.addActionListener(this::addBookToLoan);
        firstRow.add(buttonKeyAdd, constraints);

        JPanel secondRow = new JPanel();
        secondRow.setLayout(new GridBagLayout());
        JLabel bookLabel = new JLabel("Libro:");
        constraints.gridx = 0;
        secondRow.add(bookLabel, constraints);

        bookNameLabel = new JLabel("Aqu?? va el nombre del libro", SwingConstants.LEFT);
        constraints.gridx = 1;
        secondRow.add(bookNameLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridy = 2;
        panel.add(firstRow, constraints);
        constraints.gridy = 3;
        panel.add(secondRow, constraints);
    }

    private void addStudentControls(JPanel panel) {
        JLabel label = new JLabel("Clave del alumno: ");
        JPanel firstRow = new JPanel();
        firstRow.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        firstRow.add(label, constraints);

        userKey = new JTextField();
        constraints.gridx = 1;
        firstRow.add(userKey, constraints);

        JButton buttonQuery = new JButton("Consultar");
        constraints.gridx = 2;
        buttonQuery.addActionListener(this::queryUser);
        firstRow.add(buttonQuery, constraints);

        JPanel secondRow = new JPanel();
        constraints.gridx = 0;
        secondRow.setLayout(new GridBagLayout());
        JLabel studentLabel = new JLabel("Alumno:");
        secondRow.add(studentLabel, constraints);

        studentNameLabel = new JLabel("Aqu?? va el nombre", SwingConstants.LEFT);
        constraints.gridx = 1;
        secondRow.add(studentNameLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.weighty = 0.05;
        panel.add(firstRow, constraints);
        constraints.weighty = 0;
        constraints.gridy = 1;
        panel.add(secondRow, constraints);
    }

    private void queryUser(ActionEvent event) {
        String clave= userKey.getText();
        Usuario usuario;
        usuario=AdminU.dameUsuarioxClave(clave);

        studentNameLabel.setText(usuario.getName());

        prestamoActual.setUsuario(usuario);
    }

    private void addBookToLoan(ActionEvent event) {
        String clave=bookKey.getText();
        Libro libro = AdminL.dameLibroxClave(clave);
        modelLibro.addElement(libro.getTitle());
    }

    private void queryBook(ActionEvent event) {
        String clave=bookKey.getText();
        Libro libro = AdminL.dameLibroxClave(clave);
        bookNameLabel.setText(libro.getTitle());
        prestamoActual.addLibros(libro);
    }

    private void performLoan(ActionEvent event) {
        int n=modelLibro.size();
        String NombreUsuario=studentNameLabel.getText();

        AdministradorDePrestamo administradorDePrestamo=new AdministradorDePrestamo();
        Empleado empleado=new Empleado();
        empleado.setClave("123");
        empleado.setName("franf");

        prestamoActual.setEmpleado(empleado);
        prestamoActual.setFechahora(LocalDateTime.now());

        administradorDePrestamo.registraPrestamo(prestamoActual);

        JOptionPane.showMessageDialog(null, "Se prestaron "+n+" libros al usuario: "+NombreUsuario);
    }
}
