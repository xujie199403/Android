Android
===================================  
开发环境：Android Studio 2.0



### BMR
  First App.
  
### Toast 
  浮动提示窗体
  
###Chat 
**EventListener**:

| Name                   |Interface                      |     
|:----------------------:|:-----------------------------:|
|   onClick()            | OnClickListener               |
|  onLongClick()         | OnLongClickListener           |      
|  onFocusChange()       | OnFocusChangeListener         |      
|    onKey()             | OnKeyListener                 |
| onCreateContextMenu()  | OnCreateContextMenuListener   |  
  
###map
  通过Intent调用手机的基础功能
   > Web：
  ```java
    Uri uri=Uri.parse("http://www.google.com.tw"); 
    Intent i=new Intent(Intent.ACTION_VIEW,uri); 
    startActivity(i);
  ```
  telphone：
  ```java
    Uri uri=Uri.parse("tel:12345678"); 
    Intent i=new Intent(Intent.ACTION_VIEW,uri); 
    startActivity(i); 
    ```
  email：
  ```java
    Uri uri=Uri.parse("123456@123.com"); 
    Intent i=new Intent(Intent.ACTION_SENDTO,uri);
    startActivity(i); 
  ```
  Camera:
  ```java
    Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    startActivity(i);
  ```

  

  
  
  
