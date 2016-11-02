
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:FILE_NOTE
/*
 *  DBObject.URL:file:/home/abaza/NetBeansProjects/Network/BlackHat/src/Database/BlackHat_Database.tbobj
 *
 *   This file is generated by 'Simple DB Object Builder'. It maybe be 
 * regenerated  again in any time. You should not add your code in 
 * this file or you  will lost your code in next time generation.
 *   URL: http://db-obj-builder.sourceforge.net
 *
 *	 Generation Time:2016-02-19 08:14
 *	 Use JDBC Driver:    SQLiteJDBC
 * 
 *	 Generated from:
 *		 URL:   jdbc:sqlite:/home/abaza/NetBeansProjects/Network/BlackHat/data/db
 * 
 *	 JDBC Information:
 *		 Catalog:null
 * 
 *	 Scheam Information:
 *		 TABLE:  video_file_path
 *		 COLUMN: 
 *			 id 	 Object 	 
 *			 date_time 	 Object 	 
 *			 file_path 	 Object 	 
 *			 file_see 	 Object 	 
 *			 file_last_see 	 Object 	 
 *		 PRIMARY KEY:
 *			 id        Object
 * 
 */
// </editor-fold>//GEN-END:FILE_NOTE

package Database;

// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:IMPORT_SECTION
// IMPORT SECTION START ------------------------------------------------
import java.sql.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.reflect.Method;
import java.lang.Object;
// IMPORT SECTION END --------------------------------------------------

// </editor-fold>//GEN-END:IMPORT_SECTION

public class Video_file_path {
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:LOAD_JDBC_DRIVER
    // LOAD JDBC DRIVER START ----------------------------------------------
    static{
        try{
            loadJdbcDriver();
        }catch(ClassNotFoundException e){
            String errMsg = getExcpMsg(e);
            throw new RuntimeException(errMsg, e);
        }
    }
    public static void loadJdbcDriver() throws ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");
    }
    private static String getExcpMsg(Exception e){
        return e.getClass().getName()+"(msg:"+e.getMessage()+")";
    }
    // LOAD JDBC DRIVER END ------------------------------------------------
    // </editor-fold>//GEN-END:LOAD_JDBC_DRIVER
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:TABLE_SCHEMA_INFO
    // TABLE SCHEMA INFORMATION START --------------------------------------
    // column fields
    public static final String FLD_ID = "id" ; 
    public static final String FLD_DATE_TIME = "date_time" ; 
    public static final String FLD_FILE_PATH = "file_path" ; 
    public static final String FLD_FILE_SEE = "file_see" ; 
    public static final String FLD_FILE_LAST_SEE = "file_last_see" ; 
    // column fields
    public static final String FLD_AUTO_INCREMENT = null  ; 
    // column names
    private static final String[] colNames = new String[]{
        "id"
        ,"date_time"
        ,"file_path"
        ,"file_see"
        ,"file_last_see"
    };
    // 	 column SQL Types
    private static final int[] colSqlTypes = new int[]{
        Types.NULL
        ,Types.NULL
        ,Types.NULL
        ,Types.NULL
        ,Types.NULL
    };
    // 	 column class name
    private static final String[] colClzNames = new String[]{
        "java.lang.Object"
        ,"java.lang.Object"
        ,"java.lang.Object"
        ,"java.lang.Object"
        ,"java.lang.Object"
    };
    // 	 load all column classes
    private static final Class[] colClzs = new Class[5];
    static {
        try{
            loadAllColumnClasses();
        }catch(ClassNotFoundException e){
            String errMsg = getExcpMsg(e);
            throw new RuntimeException(errMsg, e);
        }
    }
    public static void loadAllColumnClasses() throws ClassNotFoundException{
        colClzs[0]=Class.forName("java.lang.Object");
        colClzs[1]=Class.forName("java.lang.Object");
        colClzs[2]=Class.forName("java.lang.Object");
        colClzs[3]=Class.forName("java.lang.Object");
        colClzs[4]=Class.forName("java.lang.Object");
    }
    // 	 all columns string
    public static final String ALL_COL_STR="id,date_time,file_path,file_see,file_last_see";
    // 	 variable definition for table columns
    public final ArrayList nullAL =new ArrayList();
    private Object id ;
    private Object date_time ;
    private Object file_path ;
    private Object file_see ;
    private Object file_last_see ;
    // 	 variable definition for dirty check
    private boolean isDirty = true;
    // 	 variable definition for user object
    private Object usrObj = null;
    // TABLE SCHEMA INFORMATION END ----------------------------------------
    // </editor-fold>//GEN-END:TABLE_SCHEMA_INFO
    
    public Video_file_path(){}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:SCHEMA_METHOD_SECTION
    // SCEHMA METHODS START ------------------------------------------------
    public static int getColCount(){ return 5; }
    public static String getColName(int colIdx){
        if( colIdx>=0 && colIdx<5 ) return colNames[colIdx];
        else return null;
    }
    public static int getColIdx(String colName){
        if(colName==null) return -1;
        for(int i=0;i<5;i++){
            if(colName.equals(colNames[i])) return i;
        }
        return -1;
    }
    public static Class getColClass(int colIdx){
        if( colIdx>=0 && colIdx<5 ) return colClzs[colIdx];
        else return null;
    }
    public static int getColSqlType(int colIdx){
        if( colIdx>=0 && colIdx<5 ) return colSqlTypes[colIdx];
        else return -1;
    }
    public static String getColClzName(int colIdx){
        if( colIdx>=0 && colIdx<5 ) return colClzNames[colIdx];
        else return null;
    }
    // SCEHMA METHODS END --------------------------------------------------
    // </editor-fold>//GEN-END:SCHEMA_METHOD_SECTION
    
    //ATTRIBUTES  START ------------------------------------
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:ATTR_ACCESS_SECTION
    // 	 attributes setter and getter for all table columns 
    // 		 table column: id,	 type: Object
    public void setId(Object id){
        if(id==null && !nullAL.contains("id")){
            nullAL.add("id");
        }else if(id!=null && nullAL.contains("id")){
            nullAL.remove("id");
        }
        boolean changed = false;
        if (this.id == null) {
            if (id != null) {
                changed = true;
            }
        } else if (!this.id.equals(id)) {
            changed = true;
        }
        if (changed) {
            if (!this.isDirty) {
                this.isDirty = true;
            }
            this.id=id;
        }
    }
    public Video_file_path doSetId(Object id){
        setId(id);
        return this;
    }
    public Object getId(){
        return id;
    }
    // 		 table column: date_time,	 type: Object
    public void setDate_time(Object date_time){
        if(date_time==null && !nullAL.contains("date_time")){
            nullAL.add("date_time");
        }else if(date_time!=null && nullAL.contains("date_time")){
            nullAL.remove("date_time");
        }
        boolean changed = false;
        if (this.date_time == null) {
            if (date_time != null) {
                changed = true;
            }
        } else if (!this.date_time.equals(date_time)) {
            changed = true;
        }
        if (changed) {
            if (!this.isDirty) {
                this.isDirty = true;
            }
            this.date_time=date_time;
        }
    }
    public Video_file_path doSetDate_time(Object date_time){
        setDate_time(date_time);
        return this;
    }
    public Object getDate_time(){
        return date_time;
    }
    // 		 table column: file_path,	 type: Object
    public void setFile_path(Object file_path){
        if(file_path==null && !nullAL.contains("file_path")){
            nullAL.add("file_path");
        }else if(file_path!=null && nullAL.contains("file_path")){
            nullAL.remove("file_path");
        }
        boolean changed = false;
        if (this.file_path == null) {
            if (file_path != null) {
                changed = true;
            }
        } else if (!this.file_path.equals(file_path)) {
            changed = true;
        }
        if (changed) {
            if (!this.isDirty) {
                this.isDirty = true;
            }
            this.file_path=file_path;
        }
    }
    public Video_file_path doSetFile_path(Object file_path){
        setFile_path(file_path);
        return this;
    }
    public Object getFile_path(){
        return file_path;
    }
    // 		 table column: file_see,	 type: Object
    public void setFile_see(Object file_see){
        if(file_see==null && !nullAL.contains("file_see")){
            nullAL.add("file_see");
        }else if(file_see!=null && nullAL.contains("file_see")){
            nullAL.remove("file_see");
        }
        boolean changed = false;
        if (this.file_see == null) {
            if (file_see != null) {
                changed = true;
            }
        } else if (!this.file_see.equals(file_see)) {
            changed = true;
        }
        if (changed) {
            if (!this.isDirty) {
                this.isDirty = true;
            }
            this.file_see=file_see;
        }
    }
    public Video_file_path doSetFile_see(Object file_see){
        setFile_see(file_see);
        return this;
    }
    public Object getFile_see(){
        return file_see;
    }
    // 		 table column: file_last_see,	 type: Object
    public void setFile_last_see(Object file_last_see){
        if(file_last_see==null && !nullAL.contains("file_last_see")){
            nullAL.add("file_last_see");
        }else if(file_last_see!=null && nullAL.contains("file_last_see")){
            nullAL.remove("file_last_see");
        }
        boolean changed = false;
        if (this.file_last_see == null) {
            if (file_last_see != null) {
                changed = true;
            }
        } else if (!this.file_last_see.equals(file_last_see)) {
            changed = true;
        }
        if (changed) {
            if (!this.isDirty) {
                this.isDirty = true;
            }
            this.file_last_see=file_last_see;
        }
    }
    public Video_file_path doSetFile_last_see(Object file_last_see){
        setFile_last_see(file_last_see);
        return this;
    }
    public Object getFile_last_see(){
        return file_last_see;
    }
    // </editor-fold>//GEN-END:ATTR_ACCESS_SECTION
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:ATTR_ACCESS_SECTION2
    public void clearAllAttributes(){
        id = null;
        date_time = null;
        file_path = null;
        file_see = null;
        file_last_see = null;
    }
    public void resetAttributes(Video_file_path video_file_path){
        id = video_file_path.getId();
        date_time = video_file_path.getDate_time();
        file_path = video_file_path.getFile_path();
        file_see = video_file_path.getFile_see();
        file_last_see = video_file_path.getFile_last_see();
    }
    private void setAttributes(ResultSet rs)throws SQLException{
        ResultSetMetaData rsmd = rs.getMetaData();
        int colCnt = rsmd.getColumnCount();
        for(int idx=0;idx<colCnt;idx++){
            String colName  = rsmd.getColumnName(idx+1);
            String colClzNm = getColClzName(idx);
            Object colValue = null;
            if("java.sql.Timestamp".equals(colClzNm)){
                colValue = rs.getTimestamp(idx+1);
            }else{
                colValue = rs.getObject(idx+1);
            }
            setAttribute(colName,colValue);
        }
    }
    private void setAttribute(String colName,Object colValue){
        if("id".equals(colName)){
            this.setId((Object)colValue);
        }else if("date_time".equals(colName)){
            this.setDate_time((Object)colValue);
        }else if("file_path".equals(colName)){
            this.setFile_path((Object)colValue);
        }else if("file_see".equals(colName)){
            this.setFile_see((Object)colValue);
        }else if("file_last_see".equals(colName)){
            this.setFile_last_see((Object)colValue);
        }
    }
    public void setColValue(int colIdx,Object colValue){
        String colName = getColName(colIdx);
        setAttribute(colName,colValue);
    }
    public Object getColValue(int colIdx){
        String colName = getColName(colIdx);
        return getColValue(colName);
    }
    public Object getColValue(String colName){
        if("id".equals(colName)){
            return this.getId();
        }else if("date_time".equals(colName)){
            return this.getDate_time();
        }else if("file_path".equals(colName)){
            return this.getFile_path();
        }else if("file_see".equals(colName)){
            return this.getFile_see();
        }else if("file_last_see".equals(colName)){
            return this.getFile_last_see();
        }
        return null;
    }
    // </editor-fold>//GEN-END:ATTR_ACCESS_SECTION2
    
    // ATTRIBUTES END ------------------------------------------------------
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:EQU_STR_SECTION
    public String toString(){
        String tmpSql="";
        tmpSql+="id="+id+",";
        tmpSql+="date_time="+date_time+",";
        tmpSql+="file_path="+file_path+",";
        tmpSql+="file_see="+file_see+",";
        tmpSql+="file_last_see="+file_last_see+",";
        return tmpSql;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Video_file_path)) return false;
        Video_file_path anObj = (Video_file_path)obj ;
        if(id==null){
            if(anObj.getId()!=null){
                return false;
            }
        }else if(!id.equals(anObj.getId())){
            return false;
        }
        if(date_time==null){
            if(anObj.getDate_time()!=null){
                return false;
            }
        }else if(!date_time.equals(anObj.getDate_time())){
            return false;
        }
        if(file_path==null){
            if(anObj.getFile_path()!=null){
                return false;
            }
        }else if(!file_path.equals(anObj.getFile_path())){
            return false;
        }
        if(file_see==null){
            if(anObj.getFile_see()!=null){
                return false;
            }
        }else if(!file_see.equals(anObj.getFile_see())){
            return false;
        }
        if(file_last_see==null){
            if(anObj.getFile_last_see()!=null){
                return false;
            }
        }else if(!file_last_see.equals(anObj.getFile_last_see())){
            return false;
        }
        return true;
    }
    // </editor-fold>//GEN-END:EQU_STR_SECTION
    
    // SQL QUERY METHODS START ---------------------------------------------
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:GENERAL_QUERY
    // total arg: colStr, maxRows, pStmtParamAL
    // skip colStr, maxRows, pStmtParamAL
    public static Video_file_path queryFirstRow(Connection conn,String whereStr) throws SQLException{
        Video_file_path[] rows = queryDB(conn,ALL_COL_STR,whereStr,null, 1);
        if(rows==null || rows.length == 0) return null;
        return rows[0];
    }
    public static Video_file_path[] queryDB(Connection conn,String whereStr) throws SQLException{
        return queryDB(conn,ALL_COL_STR,whereStr,null, -1);
    }
    // skip colStr, maxRows
    public static Video_file_path queryFirstRow(Connection conn,String whereStr,ArrayList pStmtParamAL) throws SQLException{
        Video_file_path[] rows = queryDB(conn,ALL_COL_STR,whereStr,pStmtParamAL, 1);
        if(rows==null || rows.length == 0) return null;
        return rows[0];
    }
    public static Video_file_path[] queryDB(Connection conn,String whereStr,ArrayList pStmtParamAL) throws SQLException{
        return queryDB(conn,ALL_COL_STR,whereStr,pStmtParamAL, -1);
    }
    // skip colStr, pStmtParamAL
    public static Video_file_path[] queryDB(Connection conn,String whereStr, int maxRows) throws SQLException{
        return queryDB(conn,ALL_COL_STR,whereStr,null, maxRows);
    }
    // skip colStr
    public static Video_file_path[] queryDB(Connection conn,String whereStr,ArrayList pStmtParamAL , int maxRows) throws SQLException{
        return queryDB(conn,ALL_COL_STR,whereStr, pStmtParamAL, maxRows);
    }
    // skip maxRows
    public static Video_file_path[] queryDB(Connection conn,String colStr,String whereStr, ArrayList pStmtParamAL) throws SQLException{
        return queryDB(conn,colStr, whereStr,pStmtParamAL,-1);
    }
    public static Video_file_path[] queryDB(Connection conn,String colStr,String whereStr, ArrayList pStmtParamAL, int maxRows) throws SQLException{
        ResultSet rs = null;
        try{
            rs = queryResultSet(conn, colStr, whereStr,pStmtParamAL);
            ArrayList tmpAL=new ArrayList();
            while(rs.next()){
                Video_file_path obj=new Video_file_path();
                obj.setAttributes(rs);
                tmpAL.add(obj);
                if(maxRows>0 && tmpAL.size()>= maxRows) break;
            }
            Video_file_path[] objs=new Video_file_path[tmpAL.size()];
            tmpAL.toArray(objs);
            return objs;
        }finally{
            releaseResultSet(rs);
        }
    }
    public static ResultSet queryResultSet(Connection conn,String colStr,String whereStr, ArrayList pStmtParamAL) throws SQLException{
        String sqlStr="SELECT "+colStr+" FROM video_file_path "+whereStr;
        PreparedStatement pStmt = conn.prepareStatement(sqlStr);
        if(pStmtParamAL!=null){
            for(int idx=0;idx<pStmtParamAL.size();idx++){
                Object param = pStmtParamAL.get(idx);
                pStmt.setObject(idx+1,param);//test
            }
        }
        return pStmt.executeQuery();
    }
    public static void releaseResultSet(ResultSet rs) throws SQLException{
        if(rs!=null){
            Statement stmt = rs.getStatement();
            try{rs.close();}catch(Exception e){System.out.println("e:"+e);}
            try{stmt.close();}catch(Exception e){System.out.println("e:"+e);}
        }
    }
    // </editor-fold>//GEN-END:GENERAL_QUERY
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:PRIMARY_KEY_QUERY
    public static Video_file_path queryByPK(Connection conn, Object id) throws SQLException {
        return queryByPK(conn, ALL_COL_STR, id);
    }
    public static Video_file_path queryByPK(Connection conn, String colStr, Object id) throws SQLException {
        String sqlStr="SELECT "+colStr+" FROM video_file_path WHERE id = ? ";
        Video_file_path ans = null;
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        try{
            pStmt=conn.prepareStatement(sqlStr);
            pStmt.setObject(1,id);
            rs = pStmt.executeQuery();
            if(rs.next()){
                ans = new Video_file_path();
                ans.setAttributes(rs);
            }
        }finally{
            if(rs!=null) rs.close();
            if(pStmt!=null) pStmt.close();
        }
        return ans;
    }
    // </editor-fold>//GEN-END:PRIMARY_KEY_QUERY
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:FOREIGN_KEY_QUERY
    // </editor-fold>//GEN-END:FOREIGN_KEY_QUERY
    
    // SQL QUERY METHODS END -----------------------------------------------
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:INSERT_DELETE_UPDATE_METHOD
    // SQL MODIFICATION METHODS START --------------------------------------
    public boolean insertIntoDB(Connection conn) throws SQLException {
        String sqlStr="INSERT INTO video_file_path (";
        boolean ifFirst=true;
        int valColCnt=0;
        for(int i=0;i<colNames.length;i++){
            String colName = colNames[i];
            if(this.getColValue(colName)!=null || nullAL.contains(colName)){
                if(ifFirst){ifFirst=false; }else{sqlStr+=",";}
                valColCnt++;
                sqlStr+=colName;
            }
        }
        sqlStr+=") values (";
        for(int i=0;i<valColCnt;i++){
            if(i!=0) sqlStr+=",";
            sqlStr+=" ? ";
        }
        sqlStr+=")";
        PreparedStatement pStmt=null;
        try{
            pStmt=conn.prepareStatement(sqlStr);
            valColCnt=0;
            ifFirst=true;
            for(int i=0;i<colNames.length;i++){
                String colName = colNames[i];
                if(this.getColValue(colName)!=null || nullAL.contains(colName)){
                    valColCnt++;
                    if(!nullAL.contains(colName)){
                        pStmt.setObject(valColCnt,getColValue(colName));
                    }else{// user set it null
                        int colIdx = getColIdx(colName);
                        pStmt.setNull(valColCnt,getColSqlType(colIdx));
                    }
                }
            }
            pStmt.execute();
        }finally{
            try{pStmt.close();}catch(Exception e){}
        }
        this.isDirty=false;
        return true;
    }
    public boolean deleteFromDB(Connection conn) throws SQLException {
        if(id==null){return false;}
        String sqlStr="DELETE FROM video_file_path WHERE id=? ";
        PreparedStatement pStmt=conn.prepareStatement(sqlStr);
        pStmt.setObject(1,id);
        pStmt.execute();
        pStmt.close();
        this.isDirty=false;
        return true;
    }
    // update method
    public boolean updateDB(Connection conn) throws SQLException {
        return updateDB(conn ,"id","date_time","file_path","file_see","file_last_see");
    }
    public boolean updateDB(Connection conn,String... colStrs) throws SQLException {
        if(id==null){return false;}
        String sqlStr = getUpdateSQL(colStrs);
        String[] updColNames=getUpdColNames(colStrs);
        PreparedStatement pStmt=null;
        try{
            pStmt=conn.prepareStatement(sqlStr);
            for(int i=0;i<updColNames.length;i++){
                Object obj = getColValue(updColNames[i]);
                if(obj!=null) pStmt.setObject(i+1,obj);
                else pStmt.setNull(i+1, getColSqlType(getColIdx(updColNames[i])));
            }
            pStmt.setObject(updColNames.length+1,id);
            pStmt.execute();
        }finally{
            try{pStmt.close();}catch(Exception ex){}
        }
        this.isDirty=false;
        return true;
    }
    public String getUpdateSQL(String... colStrs){
        String[] updColNames=getUpdColNames(colStrs);
        String sqlStr="UPDATE video_file_path SET ";
        for(int i=0;i<updColNames.length;i++){
            if(i!=0) sqlStr+=", ";
            sqlStr+=updColNames[i]+"=?";
        }
        sqlStr+=" WHERE id = ? ";
        return sqlStr;
    }
    private String[] getUpdColNames(String... colStrs){
        ArrayList tmpAL=new ArrayList();
        for (String colStr : colStrs) {
            if (colStr == null) continue;
            colStr=colStr.trim();
            if("".equals(colStr)) continue;
            else if("id".equalsIgnoreCase(colStr))continue;
            if(this.getColValue(colStr)==null && !this.nullAL.contains(colStr)) continue;
            tmpAL.add(colStr);
        }
        String[] ans=new String[tmpAL.size()];
        tmpAL.toArray(ans);
        return ans;
    }
    // SQL MODIFICATION METHODS END ----------------------------------------
    // </editor-fold>//GEN-END:INSERT_DELETE_UPDATE_METHOD
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:OTHER_ISSUES_METHOD
    public boolean isDirty(){
        return isDirty;
    }
    public void clearDirtyFlag(){
        this.isDirty=false;
    }
    public Object getUsrObj(){
        return usrObj;
    }
    public void setUsrObj(Object usrObj){
        this.usrObj = usrObj;
    }
    // </editor-fold>//GEN-END:OTHER_ISSUES_METHOD
}