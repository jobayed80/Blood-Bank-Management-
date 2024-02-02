
package blood;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;


public class TheModel1 extends AbstractTableModel{

    
    
    private String[] columns;
    private Object[][] rows;
    public TheModel1(){}
    
    public TheModel1(Object[][] data, String[]  columnName)
    {
        this.columns= columnName;
       this.rows= data;
    }
    
    public  Class getColumnClass(int column)
    {
        if(column==4)
        {
            
            return Icon.class;
            
        }
        else
        {
            return getValueAt(0,column).getClass();
        }
    }
   
    public int getRowCount() {
        
       
        return this.rows.length;
       
    }

    
    public int getColumnCount() {
        return this.columns.length;
     
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
        
         
    }

    
    public String getColumnName(int col)
    {
        return this.columns[col];
    }
    
    
    
    
}
