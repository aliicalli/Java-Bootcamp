package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.ColorService;
import com.etiya.rentACar.business.requests.colorRequests.CreateColorRequest;
import com.etiya.rentACar.business.responses.brandResponses.ListBrandDto;
import com.etiya.rentACar.business.responses.colorResponses.ListColorDto;
import com.etiya.rentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentACar.dataAccess.abstracts.ColorDao;
import com.etiya.rentACar.entities.Brand;
import com.etiya.rentACar.entities.Color;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ColorManager implements ColorService {

    private ColorDao colorDao;
    private ModelMapperService modelMapperService;

    public ColorManager(ColorDao colorDao, ModelMapperService modelMapperService) {
        this.colorDao = colorDao;
        this.modelMapperService= modelMapperService;
    }

    @Override
    public void add(CreateColorRequest createColorRequest) {

       Color colour = this.modelMapperService.forRequest().map(createColorRequest,Color.class);
        this.colorDao.save(colour);


    }

    @Override
    public List<ListColorDto> getAll() {
        List<Color> colors = this.colorDao.findAll();
        List<ListColorDto> response = colors.stream().map(color -> modelMapperService.forDto().map(color,ListColorDto.class)).collect(Collectors.toList());
        return  response;
    }


}
