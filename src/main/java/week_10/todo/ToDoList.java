package week_10.todo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ToDoList extends JFrame{
    private JPanel rootPanel;
    private JTextField newToDoTextField;
    private JButton addToDoButton;
    private JList<String> toDoList;
    private JButton deleteSelectedButton;
    private DefaultListModel<String> listModel;
    private JPopupMenu rightClickMenu;
    private JMenuItem deleteMenuItem;

    ToDoList(){
        setTitle("To Do List");
        setContentPane(rootPanel);
        setPreferredSize(new Dimension(500,500));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        toDoList.setModel(listModel);
        toDoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        getRootPane().setDefaultButton(addToDoButton);

        rightClickMenu = new JPopupMenu();
        deleteMenuItem = new JMenuItem("Delete");
        rightClickMenu.add(deleteMenuItem);

        toDoList.setComponentPopupMenu(rightClickMenu);

        addListeners();
    }

    private void addListeners() {

        addToDoButton.addActionListener(e -> {
            String newToDo = newToDoTextField.getText();
            newToDo = newToDo.trim(); // remove whitespace
            if (newToDo.isEmpty()) {
                JOptionPane.showMessageDialog(ToDoList.this, "Enter a todo item");
            } else {
                listModel.addElement(newToDo);
                newToDoTextField.setText(""); // Empty String.
            }
        });

//        toDoList.addListSelectionListener(new ListSelectionListener() {
//            @Override
//            public void valueChanged(ListSelectionEvent e) {
//                int selectedIndex = toDoList.getSelectedIndex(); // - 1 if nothing is selected.
//                if (selectedIndex != -1) {
//                    String itemToDelete = toDoList.getSelectedValue();
//                    if (JOptionPane.showConfirmDialog(ToDoList.this, "Delete " +
//                            itemToDelete + "?","Delete", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
//                        listModel.remove(selectedIndex);
//                    }
//
//                }
//            }
//        });

        deleteSelectedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = toDoList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(ToDoList.this, "Select an item to delete.a");
                }
            }
        });

        deleteMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = toDoList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(ToDoList.this, "Select an item to delete.");
                }
            }
        });

        toDoList.addMouseListener(new MouseListener() {
            @Override
            // For some reason clicked was not working with mouse, could be because DPI gaming mouse, or could be
            // Issue with computer not registering a click.
            public void mouseClicked(MouseEvent e) {
//                int selection = toDoList.locationToIndex(e.getPoint()); // which JList item under mouse click.
//                toDoList.setSelectedIndex(selection);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                int selection = toDoList.locationToIndex(e.getPoint()); // which JList item under mouse click.
                toDoList.setSelectedIndex(selection);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
