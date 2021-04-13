package me.cchu.mall.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Catelog2Vo implements Serializable {

    private String id;

    private String name;

    private String catelog1Id;

    private List<Catelog3Vo> catelog3Vos;
}