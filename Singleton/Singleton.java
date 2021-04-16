// Lazy Initialization
/*
Good
ไม่เสียเวลาในการสร้าง 
ไม่เปลือง memory

BAD
ตอนจะสร้างถ้ามันต้องไปทำงานนั่นนู่นนี่เยอะ มันจะทำให้โปรแกรมดูหน่วงๆหน่อยนึง จนกว่าจะสร้างเสร็จ
มีปัญหากับการทำงานแบบ Multi-Threading เพราะมันมีโอกาสเข้าไปสร้าง instance พร้อมกัน
 */
// public class Singleton {
//     private static Singleton instance;

//     private Singleton(){}

//     public static Singleton GetInstance(){
//         if (instance == null){
//             instance = new Singleton();
//         }
//         return instance;
//     }
// }


//Early Initialization
/*
Good
หลังจากที่มันสร้างเสร็จมันจะพร้อมใช้งานทันที ดังนั้นตอนที่ถูกเรียกใช้ มันจะไม่รู้สึกหน่วงๆ
ไม่มีปัญหากับ Multi-Threading

Bad
เสียเวลาในการสร้าง (ไปหน่วงตอนเปิดแอพแทน)
เปลือง memory เพราะ object นั้นอาจไม่เคยถูกเรียกใช้เลยก็ได้ แต่มันถูกสร้างไว้แล้ว
*/
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton GetInstance(){
        return instance;
    }
}

