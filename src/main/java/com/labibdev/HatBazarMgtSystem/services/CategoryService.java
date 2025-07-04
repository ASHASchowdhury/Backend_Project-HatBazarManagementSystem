package com.labibdev.HatBazarMgtSystem.services;

import com.labibdev.HatBazarMgtSystem.dtos.CategoryDTO;
import com.labibdev.HatBazarMgtSystem.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);

}
