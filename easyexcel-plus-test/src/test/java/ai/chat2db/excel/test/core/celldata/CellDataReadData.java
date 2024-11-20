package ai.chat2db.excel.test.core.celldata;

import ai.chat2db.excel.annotation.format.DateTimeFormat;
import ai.chat2db.excel.metadata.data.ReadCellData;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Jiaju Zhuang
 */
@Getter
@Setter
@EqualsAndHashCode
public class CellDataReadData {
    @DateTimeFormat("yyyy年MM月dd日")
    private ReadCellData<String> date;
    private ReadCellData<Integer> integer1;
    private Integer integer2;
    private ReadCellData<?> formulaValue;
}