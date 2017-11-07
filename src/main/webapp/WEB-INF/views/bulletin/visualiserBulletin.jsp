<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - Paie</title>

<!-- css Bootstrap -->
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/bootstrap-theme.min.css"
	rel="stylesheet">

<script src="<%=request.getContextPath()%>/js/jquery-3.2.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
<!-- HTML5 Shim et Respond.js permet Ã  IE8 de supporter les Ã©lÃ©ments du HTML5 -->
<!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light"
		style="margin-left: 12%;">
		<a class="navbar-brand" href="<%=request.getContextPath()%>/mvc/employes/lister">Employé</a> <a
			class="navbar-brand" href="<%=request.getContextPath()%>/mvc/bulletin/lister">Bulletin</a>
	</nav>

	<div class="container top">
		<div class="row">
			<div class="col-3">
				<strong>Entreprise</strong> <br>
				${bulletin.remunerationEmploye.entreprise.denomination} <br>
				SIRET : ${bulletin.remunerationEmploye.entreprise.siret}
			</div>
			<div class="col-3 offset-6">
				<strong>Période</strong><br> Du
				${bulletin.periode.dateDebut} au
				${bulletin.periode.dateFin} <br> <br> <strong>Matricule
					: ${bulletin.remunerationEmploye.matricule}</strong>
			</div>
		</div>

		<div class="row">
			<div class="col">
				<h3>Salaire</h3>
				<table class="table table-bordered table-hover">
					<thead>
						<tr class="grey">
							<td>Rubriques</td>
							<td>Base</td>
							<td>Taux Salarial</td>
							<td>Montant Salarial</td>
							<td>Taux patronal</td>
							<td>Cot. patronales</td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="grey">Salaire de base</td>
							<td>${bulletin.remunerationEmploye.grade.nbHeuresBase}</td>
							<td><fmt:formatNumber type="number"
									value="${bulletin.remunerationEmploye.grade.tauxBase}"
									minFractionDigits="2" maxFractionDigits="2" /></td>
							<td>${calcRem.salaireDeBase}</td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td class="grey">Prime Except.</td>
							<td></td>
							<td></td>
							<td>${bulletin.primeExceptionnelle}</td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td class="grey"></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td class="grey">Salaire Brut</td>
							<td></td>
							<td></td>
							<td>${calcRem.salaireBrut}</td>
							<td></td>
							<td></td>
						</tr>
					</tbody>
				</table>

				<h3>Cotisations</h3>
				<table class="table table-bordered table-hover">
					<thead>
						<tr class="grey">
							<td>Rubriques</td>
							<td>Base</td>
							<td>Taux Salarial</td>
							<td>Montant Salarial</td>
							<td>Taux patronal</td>
							<td>Cot. patronales</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${bulletin.remunerationEmploye.profilRemuneration.cotisationsNonImposables}" var="cotisation">
							<tr>
								<td>${cotisation.code}-${cotisation.libelle}</td>
								<td>${calcRem.salaireBrut}</td>
								<td>${cotisation.tauxSalarial}</td>
								<td><c:if test="${cotisation.tauxSalarial != null}">
										<fmt:formatNumber type="number"
											value="${calcRem.salaireBrut * cotisation.tauxSalarial}"
											minFractionDigits="2" maxFractionDigits="2" />
									</c:if></td>
								<td>${cotisation.tauxPatronal}</td>
								<td><c:if test="${cotisation.tauxPatronal != null}">
										<fmt:formatNumber type="number"
											value="${calcRem.salaireBrut * cotisation.tauxPatronal}"
											minFractionDigits="2" maxFractionDigits="2" />
									</c:if></td>
							</tr>
						</c:forEach>
						<tr>
							<td class="grey">Total Retenue</td>
							<td></td>
							<td></td>
							<td><fmt:formatNumber type="number"
									value="${calcRem.totalRetenueSalarial}"
									minFractionDigits="2" maxFractionDigits="2" /></td>
							<td></td>
							<td><fmt:formatNumber type="number"
									value="${calcRem.totalCotisationsPatronales}"
									minFractionDigits="2" maxFractionDigits="2" /></td>
						</tr>

					</tbody>
				</table>
				<h3>NET Imposable : ${calcRem.netImposable}
					€</h3>
				<table class="table table-bordered table-hover">
					<thead>
						<tr class="grey">
							<td>Rubriques</td>
							<td>Base</td>
							<td>Taux Salarial</td>
							<td>Montant Salarial</td>
							<td>Taux patronal</td>
							<td>Cot. patronales</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${bulletin.remunerationEmploye.profilRemuneration.cotisationsImposables}" var="cotisation">
							<tr>
								<td>${cotisation.code}-${cotisation.libelle}</td>
								<td>${calcRem.salaireBrut}</td>
								<td>${cotisation.tauxSalarial}</td>
								<td><c:if test="${cotisation.tauxSalarial != null}">
										<fmt:formatNumber type="number"
											value="${calcRem.salaireBrut * cotisation.tauxSalarial}"
											minFractionDigits="2" maxFractionDigits="2" />
									</c:if></td>
								<td></td>
								<td></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
				<div class="col-3 offset-9" style="text-align: right;">
					<strong>NET A PAYER :
						${calcRem.netAPayer} €</strong>
				</div>
			</div>
		</div>
	</div>
</body>
</html>