<?xml version="1.0" encoding="UTF-8"?>
<!-- Created with Jaspersoft Studio version 9.0.0.final using JasperReports Library version 6.21.0-4f56c4f36cd19e17675219a9ac4692d5f0f13b06  -->
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="EmployeeReportGroups" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" uuid="15a908c8-06f8-4478-9aa0-448bc223a95e">
	<property name="com.jaspersoft.studio.data.sql.tables" value=""/>
	<property name="com.jaspersoft.studio.data.defaultdataadapter" value="final"/>
	<queryString language="SQL">
		<![CDATA[SELECT Employee_ID,
	Employee_Name, Department,
	Salary_KSH, Hire_Date
FROM employee_details
where Department in (
	'Marketing',
	 'Finance',
	 'Human Resources',
	 'Sales',
	 'Operations',
	 'Customer Service',
	 'IT',
	 'Research & Development',
	 'Quality Assurance',
	 'Administration'
)
Order by Department asc]]>
	</queryString>
	<field name="Employee_ID" class="java.lang.Integer">
		<property name="com.jaspersoft.studio.field.name" value="Employee_ID"/>
		<property name="com.jaspersoft.studio.field.label" value="Employee_ID"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<field name="Employee_Name" class="java.lang.String">
		<property name="com.jaspersoft.studio.field.name" value="Employee_Name"/>
		<property name="com.jaspersoft.studio.field.label" value="Employee_Name"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<field name="Department" class="java.lang.String">
		<property name="com.jaspersoft.studio.field.name" value="Department"/>
		<property name="com.jaspersoft.studio.field.label" value="Department"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<field name="Salary_KSH" class="java.lang.Integer">
		<property name="com.jaspersoft.studio.field.name" value="Salary_KSH"/>
		<property name="com.jaspersoft.studio.field.label" value="Salary_KSH"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<field name="Hire_Date" class="java.sql.Date">
		<property name="com.jaspersoft.studio.field.name" value="Hire_Date"/>
		<property name="com.jaspersoft.studio.field.label" value="Hire_Date"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<variable name="Salary_KSH1" class="java.lang.Integer" resetType="Group" resetGroup="Group1" calculation="Sum">
		<variableExpression><![CDATA[$F{Salary_KSH}]]></variableExpression>
	</variable>
	<group name="Group1">
		<groupExpression><![CDATA[$F{Department}]]></groupExpression>
		<groupHeader>
			<band height="30">
				<textField>
					<reportElement mode="Opaque" x="0" y="0" width="555" height="30" backcolor="#57D97E" uuid="9eed218a-dd33-469b-bd24-7642e23dd267"/>
					<box>
						<pen lineWidth="0.001" lineStyle="Dotted"/>
						<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
						<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
						<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
						<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					</box>
					<textElement>
						<font size="12" isBold="true"/>
					</textElement>
					<textFieldExpression><![CDATA[$F{Department}]]></textFieldExpression>
				</textField>
			</band>
		</groupHeader>
		<groupFooter>
			<band height="30">
				<textField>
					<reportElement mode="Opaque" x="279" y="0" width="137" height="30" backcolor="#F4FC7C" uuid="e22bce56-f436-4352-9b67-e2be93f8f73a"/>
					<box>
						<pen lineWidth="0.001" lineStyle="Dotted"/>
						<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
						<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
						<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
						<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					</box>
					<textElement textAlignment="Center">
						<font isBold="true"/>
					</textElement>
					<textFieldExpression><![CDATA[$V{Salary_KSH1}]]></textFieldExpression>
				</textField>
				<staticText>
					<reportElement mode="Opaque" x="139" y="0" width="139" height="30" backcolor="#F4FC7C" uuid="75544a15-9fc0-473a-99f5-67d3cc62b5c5"/>
					<box>
						<pen lineWidth="0.001" lineStyle="Dotted"/>
						<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
						<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
						<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
						<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					</box>
					<textElement>
						<font isBold="true"/>
					</textElement>
					<text><![CDATA[Total department Salaries]]></text>
				</staticText>
			</band>
		</groupFooter>
	</group>
	<background>
		<band splitType="Stretch"/>
	</background>
	<title>
		<band height="79" splitType="Stretch">
			<staticText>
				<reportElement x="124" y="17" width="307" height="46" uuid="831454a7-909f-426f-8eed-d292f62e84c9"/>
				<textElement textAlignment="Center" verticalAlignment="Middle">
					<font fontName="Old English Text MT" size="28"/>
				</textElement>
				<text><![CDATA[The Time Company]]></text>
			</staticText>
			<staticText>
				<reportElement x="498" y="25" width="46" height="31" uuid="dd63325a-4b7b-4d93-ab55-79fb47a77368"/>
				<textElement textAlignment="Right">
					<font size="8"/>
				</textElement>
				<text><![CDATA[Nariobi, Kenya
12345-00100
time@co.ke]]></text>
			</staticText>
			<image>
				<reportElement x="10" y="15" width="50" height="50" uuid="fe089648-2905-468f-acd7-c8f102c82561"/>
				<imageExpression><![CDATA["time.jpg"]]></imageExpression>
			</image>
		</band>
	</title>
	<columnHeader>
		<band height="30" splitType="Stretch">
			<staticText>
				<reportElement mode="Opaque" x="0" y="0" width="141" height="30" backcolor="#51EAF5" uuid="967d9428-f94a-4a8f-8a8e-ee24ac7c9c21">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="1b2b817d-9ae2-4801-80f9-6bf6a0fdc404"/>
				</reportElement>
				<box>
					<pen lineWidth="0.001" lineStyle="Dotted"/>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement>
					<font size="12" isBold="true"/>
				</textElement>
				<text><![CDATA[Employee ID]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="141" y="0" width="138" height="30" backcolor="#51EAF5" uuid="8b3a961e-47e9-447f-8425-3e6828f9ffa8">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="6337145f-b467-40b2-9f2f-5ef6742544c0"/>
				</reportElement>
				<box>
					<pen lineWidth="0.001" lineStyle="Dotted"/>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement>
					<font size="12" isBold="true"/>
				</textElement>
				<text><![CDATA[Employee's Name]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="279" y="0" width="138" height="30" backcolor="#51EAF5" uuid="3533c089-ff16-40dd-8710-2ec73695af20">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="ea057a32-5663-44b2-934b-31dd5435f682"/>
				</reportElement>
				<box>
					<pen lineWidth="0.001" lineStyle="Dotted"/>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement>
					<font size="12" isBold="true"/>
				</textElement>
				<text><![CDATA[Salary in Ksh]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="417" y="0" width="138" height="30" backcolor="#51EAF5" uuid="56747260-75b7-42e8-b66f-fd100cb9596a">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="c6f84e9d-70fc-4c2a-a5ec-0be8e309ca24"/>
				</reportElement>
				<box>
					<pen lineWidth="0.001" lineStyle="Dotted"/>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement>
					<font size="12" isBold="true"/>
				</textElement>
				<text><![CDATA[Hire Date]]></text>
			</staticText>
		</band>
	</columnHeader>
	<detail>
		<band height="30" splitType="Stretch">
			<textField>
				<reportElement x="0" y="0" width="141" height="30" uuid="7540f391-69cb-44a5-9027-6d11b094f0d1">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="1b2b817d-9ae2-4801-80f9-6bf6a0fdc404"/>
				</reportElement>
				<box>
					<pen lineWidth="0.001" lineStyle="Dotted"/>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textFieldExpression><![CDATA[$F{Employee_ID}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="141" y="0" width="138" height="30" uuid="658b25af-2542-4a4b-afda-e335551f4976">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="6337145f-b467-40b2-9f2f-5ef6742544c0"/>
				</reportElement>
				<box>
					<pen lineWidth="0.001" lineStyle="Dotted"/>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textFieldExpression><![CDATA[$F{Employee_Name}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="279" y="0" width="138" height="30" uuid="274cec6b-64d7-4cbd-8466-517961738c41">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="ea057a32-5663-44b2-934b-31dd5435f682"/>
				</reportElement>
				<box>
					<pen lineWidth="0.001" lineStyle="Dotted"/>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Center"/>
				<textFieldExpression><![CDATA[$F{Salary_KSH}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="417" y="0" width="138" height="30" uuid="50ea93fe-9412-4eba-93a2-61ccb1178ecb">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="c6f84e9d-70fc-4c2a-a5ec-0be8e309ca24"/>
				</reportElement>
				<box>
					<pen lineWidth="0.001" lineStyle="Dotted"/>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textFieldExpression><![CDATA[$F{Hire_Date}]]></textFieldExpression>
			</textField>
		</band>
	</detail>
	<columnFooter>
		<band height="45" splitType="Stretch"/>
	</columnFooter>
	<pageFooter>
		<band height="54" splitType="Stretch"/>
	</pageFooter>
	<summary>
		<band height="42" splitType="Stretch">
			<staticText>
				<reportElement x="168" y="10" width="218" height="30" uuid="25bbb269-1264-42da-8272-eb1721555532"/>
				<textElement textAlignment="Center" verticalAlignment="Middle">
					<font isBold="true"/>
				</textElement>
				<text><![CDATA[****** THIS IS THE LAST PAGE ******]]></text>
			</staticText>
		</band>
	</summary>
</jasperReport>
