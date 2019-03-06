package entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "返回值模型")
public class Result {

    @ApiModelProperty(value = "标志")
    private boolean flag;

    @ApiModelProperty(value = "标志码", example = "40001")
    private Integer code;

    @ApiModelProperty(value = "mesage")
    private String message;

    @ApiModelProperty(value = "信息")
    private Object data;

    public Result(boolean flag, Integer code, String message) {
        super();
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}
