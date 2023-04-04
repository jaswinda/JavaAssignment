import javax.swing.*;
import java.util.ArrayList;

public class ShowAllForm extends JFrame {

    public ShowAllForm(ArrayList<Student> students){
        setTitle("Show All");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        String[] columnNames = {"Name", "Age", "Address", "Phone"};
        String[][] data = new String[students.size()][4];

        for(int i = 0; i < students.size(); i++){
            data[i][0] = students.get(i).getName();
            data[i][1] = String.valueOf(students.get(i).getAge());
            data[i][2] = students.get(i).getAddress();
            data[i][3] = students.get(i).getPhone();
        }

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);


    }
}
