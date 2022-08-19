import java.awt.*;
import java.applet.*;
public class Converter extends Applet {
    Label toLabel, fromLabel, inputLabel, outputLabel, borderLabel, titleLabel;
    Choice to, from;
    TextField input;
    TextField output;
    Button convert;
    Font labels, font, title, inputs;
    public void init() {
        //setting up fonts
        font = new Font("Arial", Font.PLAIN, 20);
        labels = new Font("Arial", Font.PLAIN, 18);
        title = new Font("Arial", Font.PLAIN, 24);
        inputs = new Font("Arial", Font.PLAIN, 16);

        // setting up dropdown
        to=new Choice();
        to.add("Decimal");
        to.add("Hexadecimal");
        to.add("Octal");
        to.add("Binary");
        to.setFont(inputs);
        add(to);

        from=new Choice();
        from.add("Decimal");
        from.add("Hexadecimal");
        from.add("Octal");
        from.add("Binary");
        from.setFont(inputs);
        add(from);

        // setting up input field
        input=new TextField(20);
        input.setFont(inputs);
        add(input);

        // setting up output field
        output=new TextField(20);
        output.setFont(inputs);
        output.setEditable(false);
        add(output);

        // setting up convert button
        convert=new Button("Convert");
        convert.setFont(inputs);
        add(convert);

        // setting up labels
        toLabel=new Label("Convert to:");
        toLabel.setFont(labels);
        add(toLabel);
        fromLabel = new Label("Convert from:");
        fromLabel.setFont(labels);
        add(fromLabel);
        inputLabel=new Label("Input:");
        inputLabel.setFont(labels);
        add(inputLabel);
        outputLabel=new Label("Output:");
        outputLabel.setFont(labels);
        add(outputLabel);
        borderLabel=new Label("");
        borderLabel.setBackground(Color.black);
        add(borderLabel);
        titleLabel=new Label("Number Converter");
        titleLabel.setFont(title);
        add(titleLabel);
    }
    public void paint(Graphics g) {
        // setting up font
        g.setFont(font);

        // setting up layout
        titleLabel.setBounds(100, 15, 300, 30);
        borderLabel.setBounds(0, 50, 400, 6);
        fromLabel.setBounds(50, 80, 120, 25);
        from.setBounds(180, 80, 130, 25);
        toLabel.setBounds(50, 110, 120, 25);
        to.setBounds(180, 110, 130, 25);
        inputLabel.setBounds(50, 140, 100, 25);
        input.setBounds(180, 140, 130, 25);
        outputLabel.setBounds(50, 170, 100, 25);
        output.setBounds(180, 170, 130, 25);
        convert.setBounds(180, 210, 130, 25);
        convert.addActionListener(l -> {
            String in=input.getText();
            String out="";
            String convertTo=to.getSelectedItem();
            String convertFrom=from.getSelectedItem();
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
}
/*
<html>
<head> </head>
    <body>
        <applet code="Converter.java" height=260 width=400></applet>
    </body>
</html>
*/