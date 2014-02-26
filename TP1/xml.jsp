<?xml version="1.0" encoding="ISO-8859-1"?>
 <%@ page contentType="text/xml;charset=ISO-8859-1" %>
 <jsp:useBean id="xml" class="test.Usager"/>
 <Systeme>
	 <Usagers>
		 <Usager_Id><% out.print(xml.getId()); %></Usager_Id>
		 <Usager_Nom><% out.print(xml.getNom_usager()); %></Usager_Nom>
		 <Usager_MotDePasse><% out.print(xml.getMot_de_passe()); %></Usager_MotDePasse>
		 <Usager_Adresse><% out.print(xml.getAdresse()); %></Usager_Adresse>
		 <Usager_Photo><% out.print(xml.getPhoto()); %></Usager_Photo>     
	 </Usagers>
 </Systeme>
