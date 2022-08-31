import java.awt.*;
import javax.swing.*;
public class Converter extends JFrame {
    JLabel toLabel, fromLabel, inputLabel, outputLabel, titleLabel;
    JComboBox<String> to, from;
    JTextField input, output;
    JButton convert;
    ImageIcon icon = new ImageIcon("assets/convert-logo.png");
    Font labels, font, title, inputs;

    // defining constructor
    public Converter() {
        super("Converter");
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLayout(null);
        initialiseObjects();
    }
    public void initialiseObjects() {
        //setting up fonts
        font = new Font("Arial", Font.PLAIN, 20);
        labels = new Font("Arial", Font.PLAIN, 18);
        title = new Font("Arial", Font.PLAIN, 24);
        inputs = new Font("Arial", Font.PLAIN, 16);

        // setting up dropdown
        to=new JComboBox<>(new String[] {"Binary", "Octal", "Hexadecimal", "Decimal"});
        to.setFont(inputs);
        add(to);

        from=new JComboBox<String>(new String[] {"Binary", "Octal", "Hexadecimal", "Decimal"});
        from.setFont(inputs);
        add(from);

        // setting up input field
        input=new JTextField(20);
        input.setFont(inputs);
        add(input);

        // setting up output field
        output=new JTextField(20);
        output.setFont(inputs);
        output.setEditable(false);
        add(output);

        // setting up convert button
        convert=new JButton("Convert", icon);
        convert.setFont(inputs);
        convert.setBackground(Color.WHITE);
        add(convert);

        // setting up labels
        toLabel=new JLabel("Convert to:");
        toLabel.setFont(labels);
        add(toLabel);
        fromLabel = new JLabel("Convert from:");
        fromLabel.setFont(labels);
        add(fromLabel);
        inputLabel=new JLabel("Input:");
        inputLabel.setFont(labels);
        add(inputLabel);
        outputLabel=new JLabel("Output:");
        outputLabel.setFont(labels);
        add(outputLabel);
        titleLabel=new JLabel("Number Converter");
        titleLabel.setFont(title);
        add(titleLabel);

        // call makeGUI method
        makeGUI();
    }
    public void makeGUI() {
        // setting up layout
        titleLabel.setBounds(100, 15, 300, 30);
        fromLabel.setBounds(50, 80, 120, 25);
        from.setBounds(180, 80, 130, 25);
        toLabel.setBounds(50, 110, 120, 25);
        to.setBounds(180, 110, 130, 25);
        inputLabel.setBounds(50, 140, 100, 25);
        input.setBounds(180, 140, 130, 25);
        outputLabel.setBounds(50, 170, 100, 25);
        output.setBounds(180, 170, 130, 25);
        convert.setBounds(180, 210, 130, 34);
        convert.addActionListener(l -> {
            String in=input.getText();
            String out="";
            String convertTo=String.valueOf(to.getSelectedItem());
            String convertFrom=String.valueOf(from.getSelectedItem());
            try {
                if (convertFrom.equals("Decimal")) {
                    if (convertTo.equals("Hexadecimal")) out = DecimalOperations.decimalToHex(in);
                    else if (convertTo.equals("Octal")) out = DecimalOperations.decimalToOctal(in);
                    else if (convertTo.equals("Binary")) out = DecimalOperations.decimalToBinary(in);
                    else out = in;
                }
                else if (convertFrom.equals("Hexadecimal")) {
                    if (convertTo.equals("Decimal")) out = HexadecimalOperations.hexaToDecimal(in);
                    else if (convertTo.equals("Octal")) out = HexadecimalOperations.hexaToOctal(in);
                    else if (convertTo.equals("Binary")) out = HexadecimalOperations.hexaToBinary(in);
                    else out = in;
                }
                else if (convertFrom.equals("Octal")) {
                    if (convertTo.equals("Decimal")) out = OctalOperations.octalToDecimal(in);
                    else if (convertTo.equals("Hexadecimal")) out = OctalOperations.octalToHexa(in);
                    else if (convertTo.equals("Binary")) out = OctalOperations.octalToBinary(in);
                    else out = in;
                }
                else if (convertFrom.equals("Binary"))
                    if (convertTo.equals("Decimal")) out = BinaryOperations.binaryToDecimal(in);
                    else if (convertTo.equals("Hexadecimal")) out = BinaryOperations.binaryToHex(in);
                    else if (convertTo.equals("Octal")) out = BinaryOperations.binaryToOctal(in);
                    else out = in;
            }
            catch (Exception e) {
                out = "Invalid input";
            }
            output.setText(out);
        });
    }
    public static void main(String[] args) {
        new Converter();
    }
}
