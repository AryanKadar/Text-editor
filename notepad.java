import java.net.*;import java.awt.*;import java.nio.file.*;import javax.swing.*;import java.awt.event.*;import java.util.*;import java.io.*;import java.awt.datatransfer.*;import java.awt.List;
class kee{
String ke(String rt)
{int i,c=0;char t;
StringBuffer rf=new StringBuffer(rt);
for(i=0;i<rt.length();i++)
{
t=rt.charAt(i);
if(t=='\\'){
rf.insert(i+c,'\\');
c++;
}
}
return rf.toString();
}
}

class np extends Frame implements ActionListener,KeyListener{
MenuBar mb;List l1,l2,l3;Font frt;
Button b699,b996;
Label lb1,lb2,lb3;
Menu fi,ed,vi,z,fo;StringSelection jt;Frame frte;
String s69="My First Text Editor",s79="My First Text Editor";
Clipboard rt= Toolkit.getDefaultToolkit().getSystemClipboard();
MenuItem ne,op,sa,pr,cu,co,ps,sas,nw,saa,ex,zi,zo,z0,bow,gmail,font;
TextArea ta;int fg=0,i=13;
np(){saa=new MenuItem("Select All.                        Ctrl+A");ex=new MenuItem("Exit");
mb=new MenuBar();vi=new Menu("View");z=new Menu("Zoom       ");zi=new MenuItem("Zoom In                              Ctrl+PLUS");zo=new MenuItem("Zoom Out                           Ctrl+MINUS");z0=new MenuItem("Restore Default Zoom        Ctrl+0");
fi=new Menu("File");fo=new Menu("Format");font=new MenuItem("Font");
 ed=new Menu("Edit");gmail=new MenuItem("Gmail                              Ctrl+M");
ne=new MenuItem("New                                  Ctrl+N");
sas=new MenuItem("Save As...              Ctrl+Shift+S");frte=new Frame("Font");
nw=new MenuItem("New Window          Ctrl+Shift+N");
bow=new MenuItem("Search With Google..     Ctrl+G");
 op=new MenuItem("Open                               Ctrl+O");
 sa=new MenuItem("Save                                Ctrl+S");
 pr=new MenuItem("Print");
 cu=new MenuItem("Cut");
 co=new MenuItem("Copy                               Ctrl+C");
 ps=new MenuItem("Paste                              Ctrl+V");
frte.addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {frte.dispose(); }});

 ta=new TextArea();
 addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
Object opt1[]={"Save","Don't Save","Cancel"};int res=0;
if(s79.charAt(0)=='*'&&fg!=0){
                 res =  JOptionPane.showOptionDialog(null,"Do you Want To Save?", "My First Text Editor",
			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,opt1,null);
if(res==JOptionPane.NO_OPTION){
dispose();
frte.dispose();
}
else if(res==JOptionPane.YES_OPTION&&s79.charAt(0)=='*'){
String ty;int i,j=0;
File f;
 try{
String s1[]=new String[4];
s1[0]="C:\\Users\\Om\\Desktop\\calculator\\";
s1[1]="C:\\Users\\Om\\Desktop\\javanerd\\";
s1[2]="C:\\Users\\Om\\Desktop\\Text editor\\";
s1[3]="C:\\Users\\Om\\Documents\\";

for(i=0;i<4;i++)
{
ty=new String(s1[i]+s69);
f=new File(ty);
if(f.exists())
{
j++;
if(true)
{fg=0;
File f1=new File(ty);
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
s79.replace("*","");
dispose();
frte.dispose();
}
}
}
if(j==0){JFileChooser ft=new JFileChooser();
int uyh=ft.showSaveDialog(null);
if(uyh==JFileChooser.APPROVE_OPTION)
try{
fg=0;
File f1=new File(ft.getSelectedFile().getAbsolutePath());
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
s79.replace("*","");dispose();
frte.dispose();
}catch(Exception rte){}}
}
catch(Exception sr){}
}}else{dispose();}



         }     
        });
fi.add(ne);
fi.add(nw);
fi.add(op);
fi.add(sa);
fi.add(sas);
fi.add(ex);
ed.add(cu);
ed.add(co);
ed.add(ps);
ed.add(saa);
ed.add(bow);
ed.add(gmail);
fo.add(font);
vi.add(z);
z.add(zi);
z.add(zo);
z.add(z0);
mb.add(fi);
mb.add(ed);mb.add(fo);
mb.add(vi);
setMenuBar(mb);
add(ta);
setVisible(true);
setSize(630,450);
setTitle("My First Text Editor");
setLayout(new GridLayout());
ne.addActionListener(this);
sas.addActionListener(this);
cu.addActionListener(this);
co.addActionListener(this);
ps.addActionListener(this);
op.addActionListener(this);
sa.addActionListener(this);
ta.addKeyListener(this);
nw.addActionListener(this);
saa.addActionListener(this);
ex.addActionListener(this);
zi.addActionListener(this);
zo.addActionListener(this);
z0.addActionListener(this);
bow.addActionListener(this);
gmail.addActionListener(this);font.addActionListener(this);
Font font1 = new Font("SansSerif", Font.PLAIN,13);
ta.setFont(font1);

frte.setLayout(null);
frte.setTitle("Font");frte.setSize(400,450);

lb1=new Label("Font");lb2=new Label("Font style");lb3=new Label("Size");
l1=new List();l2=new List();l3=new List();b699=new Button("OK");b996=new Button("Cancel");
lb1.setBounds(42,50,30,10);lb2.setBounds(190,50,55,15);lb3.setBounds(307,50,30,10);
l1.setBounds(40,70,130,155);
l2.setBounds(187,70,100,155);l3.setBounds(305,70,50,155);
l1.add("Arial");l1.add("Courier");l1.add("Cooper Black");l1.add("Courier New");
l1.add("DialogInput");l1.add("SansSerif");l1.add("Serif");l1.add("TimesRoman");
l2.add("BOLD");
l2.add("ITALIC");
l2.add("PLAIN");
l2.add("BOLD ITALIC");b699.setBounds(230,380,45,25);b996.setBounds(300,380,45,25);
l3.add("8");l3.add("9");l3.add("10");l3.add("11");l3.add("12");l3.add("14");l3.add("16");l3.add("18");l3.add("20");
l3.add("22");l3.add("24");l3.add("26");l3.add("28");l3.add("36");l3.add("48");l3.add("72");
frte.add(l2);frte.add(l1);frte.add(l3);frte.add(lb1);frte.add(lb2);frte.add(lb3);frte.add(b699);frte.add(b996);
b699.addActionListener(this);b996.addActionListener(this);
frte.setIconImage(new ImageIcon("C:\\Users\\Om\\Downloads\\hell.jpg").getImage());
setIconImage(new ImageIcon("C:\\Users\\Om\\Downloads\\rt.jpg").getImage());
}

public void keyTyped(KeyEvent e) {
if(fg==0&&e.isControlDown()==false){
setTitle("*"+getTitle());
s79=new String("*"+getTitle());fg++;
}}
public void keyPressed(KeyEvent rt){
if(rt.isControlDown() && rt.isShiftDown() && rt.getKeyCode() == KeyEvent.VK_N)
{new np();
}
else if(rt.isControlDown() && rt.getKeyCode() == KeyEvent.VK_0)
{
if(fg==0){
setTitle("*"+getTitle());
s79=new String("*"+getTitle());fg++;
}
Font font1 = new Font("SansSerif", Font.PLAIN,13);
ta.setFont(font1);
i=13;
}
else if(rt.isControlDown() && rt.getKeyCode() == KeyEvent.VK_MINUS)
{if(i>=6){
i-=3;
Font font1 = new Font("SansSerif", Font.PLAIN,i);
ta.setFont(font1);
ta.setText(ta.getText());}
if(fg==0){
setTitle("*"+getTitle());
s79=new String("*"+getTitle());fg++;
}
}
else if(rt.isControlDown() && rt.isShiftDown() && rt.getKeyCode() == KeyEvent.VK_S)
{

JFileChooser ft=new JFileChooser();
int f=ft.showSaveDialog(null);
if(f==JFileChooser.APPROVE_OPTION)
try{
fg=0;
File f1=new File(ft.getSelectedFile().getAbsolutePath());
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
}catch(Exception rte){}

}
else if(rt.isControlDown() && rt.getKeyCode() == KeyEvent.VK_M)
{
try {
  Desktop desk = java.awt.Desktop.getDesktop();
  URI UL = new URI("http://www.gmail.com");
  desk.browse(UL);
} catch (Exception eiufrhiuhriue) {
  
}
}
else if(rt.isControlDown() && rt.getKeyCode() == KeyEvent.VK_G)
{
try {
  Desktop desk = java.awt.Desktop.getDesktop();
  URI UL = new URI("http://www.google.com");
  desk.browse(UL);
} catch (Exception eiufrhiuhriue) {
  
}
}
else if(rt.isControlDown() && rt.getKeyCode() == KeyEvent.VK_O){
Object opt1[]={"Save","Don't Save","Cancel"};int res=0;
if(s79.charAt(0)=='*'&&fg!=0){
                 res =  JOptionPane.showOptionDialog(null,"Do you Want To Save?", "My First Text Editor",
			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,opt1,null);
if(res==JOptionPane.NO_OPTION){
ta.setText("");
setTitle(s79.replace("*",""));
fg=0;
}
else if(res==JOptionPane.YES_OPTION&&s79.charAt(0)=='*'){
String ty;int i,j=0;
File f;
 try{
String s1[]=new String[4];
s1[0]="C:\\Users\\Om\\Desktop\\calculator\\";
s1[1]="C:\\Users\\Om\\Desktop\\javanerd\\";
s1[2]="C:\\Users\\Om\\Desktop\\Text editor\\";
s1[3]="C:\\Users\\Om\\Documents\\";

for(i=0;i<4;i++)
{
ty=new String(s1[i]+s69);
f=new File(ty);
if(f.exists())
{
j++;
if(true)
{fg=0;
File f1=new File(ty);
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
if(j!=0){
ta.setText("");
setTitle(s79.replace("*",""));
fg=0;}

}
}
}
if(j==0){JFileChooser ft=new JFileChooser();
int uyh=ft.showSaveDialog(null);
if(uyh==JFileChooser.APPROVE_OPTION)
try{
fg=0;
File f1=new File(ft.getSelectedFile().getAbsolutePath());
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
ta.setText("");
setTitle(s79.replace("*",""));
fg=0;
}catch(Exception rte){}}
}
catch(Exception sr){}
}}else{}
JFileChooser j=new JFileChooser();
int r=j.showOpenDialog(null);

if(r==JFileChooser.APPROVE_OPTION)
{try{
File f1=new File(j.getSelectedFile().getAbsolutePath());
s69=f1.getName();
setTitle(s69);
s79=getTitle();
FileReader fe=new FileReader(f1);
BufferedReader bw=new BufferedReader(fe);
String s24="",s15="";

while((s24=bw.readLine())!=null)
s15=s15+s24+"\n";
ta.setText(s15);
setTitle(s79.replace("*",""));
fg=0;
bw.close();
}catch(Exception er){}

}

}
else if(rt.isControlDown() && rt.getKeyCode() == KeyEvent.VK_S){
String ty="hello";int i,j=0;
File f=new File("hello.txt");
 try{
String s2[]=new String[4];
s2[0]="C:\\Users\\Om\\Desktop\\calculator\\";
s2[1]="C:\\Users\\Om\\Desktop\\javanerd\\";
s2[2]="C:\\Users\\Om\\Desktop\\Text editor\\";
s2[3]="C:\\Users\\Om\\Documents\\";

for(i=0;i<4;i++)
{
ty=new String(s2[i]+s69);
f=new File(ty);
if(f.exists())
{break;
}}
if(f.exists())
{
fg=0;
File f1=new File(ty);

setTitle(s79.replace("*",""));
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();




}
if(f.exists()==false){JFileChooser ft=new JFileChooser();
int uyh=ft.showSaveDialog(null);
if(uyh==JFileChooser.APPROVE_OPTION)
try{
fg=0;
File f1=new File(ft.getSelectedFile().getAbsolutePath());
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
}catch(Exception rte){}}
}
catch(Exception sr){}

}
else if(rt.isControlDown() && rt.getKeyCode() == KeyEvent.VK_N){
Object opt1[]={"Save","Don't Save","Cancel"};int res=0;
if(s79.charAt(0)!='*')
{ta.setText("");
fg=0;
setTitle("My First Text Editor");
}
if(s79.charAt(0)=='*'&&fg!=0){
                 res =  JOptionPane.showOptionDialog(null,"Do you Want To Save?", "My First Text Editor",
			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,opt1,null);
if(res==JOptionPane.NO_OPTION){
fg=0;ta.setText("");
setTitle("My First Text Editor");
}
else if(res==JOptionPane.YES_OPTION&&s79.charAt(0)=='*'){
String ty;int i,j=0;
File f;
 try{
String s22[]=new String[4];
s22[0]="C:\\Users\\Om\\Desktop\\calculator\\";
s22[1]="C:\\Users\\Om\\Desktop\\javanerd\\";
s22[2]="C:\\Users\\Om\\Desktop\\Text editor\\";
s22[3]="C:\\Users\\Om\\Documents\\";

for(i=0;i<4;i++)
{
ty=new String(s22[i]+s69);
f=new File(ty);
if(f.exists())
{
j++;
if(true)
{fg=0;
File f1=new File(ty);
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
s79.replace("*","");
fg=0;ta.setText("");
setTitle("My First Text Editor");
}
}
}
if(j==0){JFileChooser ft=new JFileChooser();
int uyh=ft.showSaveDialog(null);
if(uyh==JFileChooser.APPROVE_OPTION)
try{
fg=0;
File f1=new File(ft.getSelectedFile().getAbsolutePath());
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
s79.replace("*","");fg=0;ta.setText("");
setTitle("My First Text Editor");
}catch(Exception rte){}}}
catch(Exception sr){}
}else{fg=0;ta.setText("");
setTitle("My First Text Editor");}}
}
else if(rt.isControlDown() && rt.getKeyCode() == KeyEvent.VK_EQUALS)
{if(i<=73){
i+=3;
Font font1 = new Font("SansSerif", Font.PLAIN,i);
ta.setFont(font1);
ta.setText(ta.getText());}
if(fg==0){
setTitle("*"+getTitle());
s79=new String("*"+getTitle());fg++;
}
}
else if(rt.isControlDown() && rt.getKeyCode() == KeyEvent.VK_V)
{
if(fg==0){
setTitle("*"+getTitle());
s79=new String("*"+getTitle());fg++;
}
}
}
public void keyReleased(KeyEvent rt){
}

public void actionPerformed(ActionEvent e)
{
String s1=e.getActionCommand();
if(e.getSource()==ne){
Object opt1[]={"Save","Don't Save","Cancel"};int res=0;
if(s79.charAt(0)!='*')
{fg=0;ta.setText("");
setTitle("My First Text Editor");

}
if(s79.charAt(0)=='*'&&fg!=0){
                 res =  JOptionPane.showOptionDialog(null,"Do you Want To Save?", "My First Text Editor",
			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,opt1,null);
if(res==JOptionPane.NO_OPTION){
fg=0;ta.setText("");
setTitle("My First Text Editor");
}
else if(res==JOptionPane.YES_OPTION&&s79.charAt(0)=='*'){
String ty;int i,j=0;
File f;
 try{
String s22[]=new String[4];
s22[0]="C:\\Users\\Om\\Desktop\\calculator\\";
s22[1]="C:\\Users\\Om\\Desktop\\javanerd\\";
s22[2]="C:\\Users\\Om\\Desktop\\Text editor\\";
s22[3]="C:\\Users\\Om\\Documents\\";

for(i=0;i<4;i++)
{
ty=new String(s22[i]+s69);
f=new File(ty);
if(f.exists())
{
j++;
if(true)
{fg=0;
File f1=new File(ty);
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
s79.replace("*","");
fg=0;ta.setText("");
setTitle("My First Text Editor");
}
}
}
if(j==0){JFileChooser ft=new JFileChooser();
int uyh=ft.showSaveDialog(null);
if(uyh==JFileChooser.APPROVE_OPTION)
try{
fg=0;
File f1=new File(ft.getSelectedFile().getAbsolutePath());
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
s79.replace("*","");fg=0;ta.setText("");
setTitle("My First Text Editor");
}catch(Exception rte){}}}
catch(Exception sr){}
}else{fg=0;ta.setText("");
setTitle("My First Text Editor");}}}
else if(s1.equals("Cut"))
{
jt=new StringSelection(ta.getSelectedText());
rt.setContents(jt,jt);
ta.replaceRange("",ta.getSelectionStart(),ta.getSelectionEnd());
if(fg==0){
setTitle("*"+getTitle());
s79=new String("*"+getTitle());fg++;
}
}
else if(e.getSource()==co)
{jt=new StringSelection(ta.getSelectedText());
rt.setContents(jt,null);
}
else if(e.getSource()==gmail)
{try {
  Desktop desk = java.awt.Desktop.getDesktop();
  URI UL = new URI("http://www.gmail.com");
  desk.browse(UL);
} catch (Exception eiufrhiuhriue) {
  
}}
else if(e.getSource()==bow)
{
try {
  Desktop desk = java.awt.Desktop.getDesktop();
  URI UL = new URI("http://www.google.com");
  desk.browse(UL);
} catch (Exception eiufrhiuhriue) {
  
}
}
else if(e.getSource()==saa)
{
ta.selectAll();

}
else if(e.getSource()==zi)
{
if(fg==0){
setTitle("*"+getTitle());
s79=new String("*"+getTitle());fg++;
}
if(i>=6){
i-=3;
Font font1 = new Font("SansSerif", Font.PLAIN,i);
ta.setFont(font1);
ta.setText(ta.getText());}}

else if(e.getSource()==zo)
{
if(fg==0){
setTitle("*"+getTitle());
s79=new String("*"+getTitle());fg++;
}
if(i<=73){
i+=3;
Font font1 = new Font("SansSerif", Font.PLAIN,i);
ta.setFont(font1);
ta.setText(ta.getText());}
}
else if(e.getSource()==z0)
{
Font font1 = new Font("SansSerif", Font.PLAIN,13);
ta.setFont(font1);
i=13;
if(fg==0){
setTitle("*"+getTitle());
s79=new String("*"+getTitle());fg++;
}
}
else if(e.getSource()==sas)
{
JFileChooser ft=new JFileChooser();
int f=ft.showSaveDialog(null);
if(f==JFileChooser.APPROVE_OPTION)
try{
fg=0;
File f1=new File(ft.getSelectedFile().getAbsolutePath());
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
}catch(Exception rte){}

}
else if(e.getSource()==nw)
{new np();

}

else if(e.getSource()==op)
{
Object opt1[]={"Save","Don't Save","Cancel"};int res=0;
if(s79.charAt(0)=='*'&&fg!=0){
                 res =  JOptionPane.showOptionDialog(null,"Do you Want To Save?", "My First Text Editor",
			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,opt1,null);
if(res==JOptionPane.NO_OPTION){
ta.setText("");
setTitle(s79.replace("*",""));
fg=0;
}
else if(res==JOptionPane.YES_OPTION&&s79.charAt(0)=='*'){
String ty;int i,jjj=0;
File f;
 try{
String s1212[]=new String[4];
s1212[0]="C:\\Users\\Om\\Desktop\\calculator\\";
s1212[1]="C:\\Users\\Om\\Desktop\\javanerd\\";
s1212[2]="C:\\Users\\Om\\Desktop\\Text editor\\";
s1212[3]="C:\\Users\\Om\\Documents\\";

for(i=0;i<4;i++)
{
ty=new String(s1212[i]+s69);
f=new File(ty);
if(f.exists())
{
jjj++;
if(true)
{fg=0;
File f1=new File(ty);
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
if(jjj!=0){
ta.setText("");
setTitle(s79.replace("*",""));
fg=0;}

}
}
}
if(jjj==0){JFileChooser ft=new JFileChooser();
int uyh=ft.showSaveDialog(null);
if(uyh==JFileChooser.APPROVE_OPTION)
try{
fg=0;
File f1=new File(ft.getSelectedFile().getAbsolutePath());
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
ta.setText("");
setTitle(s79.replace("*",""));
fg=0;
}catch(Exception rte){}}
}
catch(Exception sr){}
}}else{}
JFileChooser j=new JFileChooser();
int r=j.showOpenDialog(null);

if(r==JFileChooser.APPROVE_OPTION)
{try{
File f1=new File(j.getSelectedFile().getAbsolutePath());
s69=f1.getName();
setTitle(s69);
s79=getTitle();
FileReader fe=new FileReader(f1);
BufferedReader bw=new BufferedReader(fe);
String s24="",s15="";

while((s24=bw.readLine())!=null)
s15=s15+s24+"\n";
ta.setText(s15);
setTitle(s79.replace("*",""));
fg=0;
bw.close();
}catch(Exception er){}




}

}
else if(e.getSource()==sa)
{
String ty="hello";int i,j=0;
File f=new File("hello.txt");
 try{
String s2[]=new String[4];
s2[0]="C:\\Users\\Om\\Desktop\\calculator\\";
s2[1]="C:\\Users\\Om\\Desktop\\javanerd\\";
s2[2]="C:\\Users\\Om\\Desktop\\Text editor\\";
s2[3]="C:\\Users\\Om\\Documents\\";

for(i=0;i<4;i++)
{
ty=new String(s2[i]+s69);
f=new File(ty);
if(f.exists())
{break;
}}
if(f.exists())
{
fg=0;
File f1=new File(ty);

setTitle(s79.replace("*",""));
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();




}
if(f.exists()==false){JFileChooser ft=new JFileChooser();
int uyh=ft.showSaveDialog(null);
if(uyh==JFileChooser.APPROVE_OPTION)
try{
fg=0;
File f1=new File(ft.getSelectedFile().getAbsolutePath());
s69=f1.getName();
setTitle(s69);
FileWriter fe=new FileWriter(f1);
BufferedWriter bw=new BufferedWriter(fe);
bw.write(ta.getText());
bw.flush();
bw.close();
}catch(Exception rte){}}
}
catch(Exception sr){}


}
else if(e.getSource()==font)
{
frte.setVisible(true);

}
else if(e.getSource()==b699){
if(l2.getItem(l2.getSelectedIndex())=="BOLD")
frt=new Font(l1.getItem(l1.getSelectedIndex()),Font.BOLD,Integer.parseInt(l3.getSelectedItem()));
else if(l2.getItem(l2.getSelectedIndex())=="PLAIN")
frt=new Font(l1.getItem(l1.getSelectedIndex()),Font.PLAIN,Integer.parseInt(l3.getSelectedItem()));
else if(l2.getItem(l2.getSelectedIndex())=="ITALIC")
frt=new Font(l1.getItem(l1.getSelectedIndex()),Font.BOLD,Integer.parseInt(l3.getSelectedItem()));
else 
frt=new Font(l1.getItem(l1.getSelectedIndex()),Font.BOLD|Font.ITALIC,Integer.parseInt(l3.getSelectedItem()));
ta.setFont(frt);
ta.setText(ta.getText());

frte.dispose();
}
else if(e.getSource()==b996){frte.dispose();}

else if(e.getSource()==ps)
{
if(fg==0){
setTitle("*"+getTitle());fg++;
s79=new String("*"+getTitle());}
try{
Transferable t=rt.getContents(null);
String s=(String)(t.getTransferData(DataFlavor.stringFlavor));
ta.replaceRange(s,ta.getSelectionStart(),ta.getSelectionEnd());
}catch(Exception er){}
}

}

}
class notepad {
public static void main(String sr[])
{new np();}}
