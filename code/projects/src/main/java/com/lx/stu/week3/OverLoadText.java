
package com.lx.stu.week3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName OverLoadText
 * @Description 重载练习
 * @Author faine
 * @Date 2020/10/19
 */
@Data
@Builder
@NoArgsConstructor
class OverLoadText {
    /*
    实部
     */
    public int realPart;
    //虚部
    public int imaginPart;

    public OverLoadText(int RealPart, int ImaginPart) {
        this.realPart = RealPart;
        this.imaginPart = ImaginPart;
    }

    public OverLoadText overLoadTextApp(OverLoadText a) {
        //此时的this.RealPart代表着调用这个方法的那个对象中的参数
        this.realPart = a.realPart + this.realPart;
        this.imaginPart = a.imaginPart + this.imaginPart;
        return this;
    }
}
