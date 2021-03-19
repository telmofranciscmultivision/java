package bcp.edp.avrotest.model;

import bcp.edp.avrotest.model.db2.DdaImage;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Dda {
    private DdaImage beforeImage;
    private DdaImage afterImage;
}