package full.rest.converter;

import org.springframework.stereotype.Component;

import core.converter.AbstractPluralDomainConverter;
import domain.jpa.Silhouette;
import domain.jpa.SilhouetteImage;
import full.rest.model.SilhouetteDto;
import full.rest.model.SilhouetteImageDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Converter between {@link Silhouette} and {@link SilhouetteDto}.
 */
 
@Component("fullSilhouetteConverter")
public class SilhouetteConverter extends AbstractPluralDomainConverter<Silhouette, SilhouetteDto> {

	@Deprecated
	@Override
	public Silhouette toDomain(@SuppressWarnings("unused") SilhouetteDto silhouetteDto) {
		throw new UnsupportedOperationException("Not implemented");
	}

	@Override
	public SilhouetteDto fromDomain(Silhouette silhouette) {
		SilhouetteDto result = new SilhouetteDto();
		result.setSectionId(silhouette.getSectionId());
		result.setState(silhouette.getState());
		result.setUrl(silhouette.getUrl());
		return result;
	}


	public SilhouetteImageDto fromDomain(SilhouetteImage silhouette) {
		SilhouetteImageDto result = new SilhouetteImageDto();
		result.setBrand(silhouette.getBrand());
		result.setType(silhouette.getType());
		result.setIndex(silhouette.getIndex());
		result.setImage(silhouette.getImage());
		return result;
	}


	public List<SilhouetteImageDto> fromDomain(List<SilhouetteImage> silhouettes) {
		List<SilhouetteImageDto> result = new ArrayList<>();
		for(SilhouetteImage image : silhouettes) {
			result.add(fromDomain(image));
		}
		return result;
	}

}
