package com.example.girish.bake.Model;

import com.example.girish.bake.Model.Ingredient_Result.Ingredient;
import com.example.girish.bake.Model.Step_Result.Step;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Girish on 1/9/2018.
 */

public class BakeResponse {
    @SerializedName("id")

    private Integer id;
    @SerializedName("name")

    private String name;
    @SerializedName("ingredients")

    private List<Ingredient> ingredients = null;
    @SerializedName("steps")

    private List<Step> steps = null;
    @SerializedName("servings")

    private Integer servings;
    @SerializedName("image")

    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
