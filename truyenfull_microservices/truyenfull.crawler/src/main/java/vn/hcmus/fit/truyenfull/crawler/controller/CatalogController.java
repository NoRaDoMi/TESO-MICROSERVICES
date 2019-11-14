package vn.hcmus.fit.truyenfull.crawler.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import vn.hcmus.fit.truyenfull.crawler.exceptions.ResourceNotFoundException;
import vn.hcmus.fit.truyenfull.crawler.model.Catalog;
import vn.hcmus.fit.truyenfull.crawler.repository.CatalogRepository;
import vn.hcmus.fit.truyenfull.crawler.utils.ReponseUtil;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class CatalogController {
    @Autowired
    CatalogRepository catalogRepository;

    //    Xu li cho https://truyenfull.vn/danh-sach/truyen-moi/
    @GetMapping(value = "/danh-sach/{url_name}",produces = "application/json")
    public String getCatalog(@PathVariable(value = "url_name") String urlname){
        Catalog catalog = catalogRepository.findByUrlname(urlname);
        String response = ReponseUtil.returnCatalog(catalog).toString();
        return response;
    }

    //   Thêm 1 danh sach cac truyen
    @PostMapping("/catalog")
    public Catalog createCatolog(@Valid @RequestBody Catalog category){
        return catalogRepository.save(category);
    }

    //    Sửa thông tin 1 danh sach
    @PutMapping("/catalog/{id}")
    public String updateComic(@PathVariable(value = "id") Long catalogId,
                              @Valid @RequestBody Catalog catalogDetails){
        Catalog catalog = catalogRepository.findById(catalogId)
                .orElseThrow(()->new ResourceNotFoundException("Catalog", "id", catalogId));
//        Giả sử ở đây chỉ đổi tên danh sach va urlname - minh họa
        try {
            if(StringUtils.isEmpty(catalogDetails.getName()) || StringUtils.isEmpty(catalogDetails.getUrlname()))
                return ReponseUtil.inValid();
            catalog.setName(catalogDetails.getName());
            catalog.setUrlname(catalog.getUrlname());
            Catalog updatedCatalog = catalogRepository.save(catalogDetails);
            return ReponseUtil.success(ReponseUtil.returnCatalog(updatedCatalog));
        } catch (Exception e) {
            return ReponseUtil.serverError();
        }
    }

    //    Xu li cho Delete Request - xoa 1 danh sach truyen
    @DeleteMapping("/catalog/{id}")
    public ResponseEntity<?> deleteComic(@PathVariable(value = "id") Long catalogId){
        Catalog catalog = catalogRepository.findById(catalogId)
                .orElseThrow(()->new ResourceNotFoundException("Catalog", "id", catalogId));
        catalogRepository.delete(catalog);

        return ResponseEntity.ok().build();
    }
}
