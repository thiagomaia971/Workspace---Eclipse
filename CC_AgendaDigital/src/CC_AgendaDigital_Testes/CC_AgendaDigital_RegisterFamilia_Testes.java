package CC_AgendaDigital_Testes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import CC_AgendaDigital_Core.ControllerData;
import CC_AgendaDigital_Core.Family;
import CC_AgendaDigital_Core.People;

public class CC_AgendaDigital_RegisterFamilia_Testes {

	@Test
	public void Cadastrar_uma_Familia_e_verificar_se_existe_alguma_familia() {
		// Arrange
		Family familia = new Family();
		ControllerData controller = new ControllerData();

		// Act
		controller.registerFamily(familia);

		// Assert
		assertFalse(controller.listOfFamily_IsEmpty());
	}

	@Test
	public void Cadastrar_a_Familia_Maias_e_Verificar_se_essa_Familia_esta_Cadastrada() {
		// Arrange
		Family familia = new Family("Maias");
		ControllerData controller = new ControllerData();

		// Act
		controller.registerFamily(familia);

		// Assert
		assertTrue(controller.checkFamilyByName("Maias"));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Cadastrar_a_Familia_Maias_e_Verificar_se_essa_Familia_esta_Cadastrada_caso_estiver_cadastrada_receber_todas_as_pessoas_dessa_familia() {
		// Arrange
		Family familia = new Family("Maias");
		familia.registerPeople(new People("Thiago"));
		familia.registerPeople(new People("Daniel"));
		
		ControllerData controller = new ControllerData();
		ArrayList<People> p = new ArrayList<People>();
		
		// Act
		p.add(new People("Thiago"));
		p.add(new People("Daniel"));
		controller.registerFamily(familia);

		// Assert
		ArrayList<People> f = controller.returnAllPeopleOfFamilyByName("Maias");
		assertArrayEquals(p.toArray(), f.toArray());
		System.out.println();
	}

}

/*
 * Cadastrar_uma_Familia_e_verificar_se_existe_alguma_familia
 * Cadastrar_a_Familia_Maias_e_Verificar_se_a_Familia_esta_Cadastrada
 * Cadastrar_a_Familia_Maias_e_Verificar_se_a_Familia_esta_Cadastrada_caso_estiver_cadastrada_receber_todas_as_pessoas_dessa_familia
 */
