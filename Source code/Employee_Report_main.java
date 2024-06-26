<?xml version="1.0" encoding="UTF-8"?>
<!-- Created with Jaspersoft Studio version 9.0.0.final using JasperReports Library version 6.21.0-4f56c4f36cd19e17675219a9ac4692d5f0f13b06  -->
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="EmployeeReport" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" uuid="89855452-b8c5-4a99-9a7f-1482209f4772">
	<property name="com.jaspersoft.studio.data.sql.tables" value=""/>
	<property name="com.jaspersoft.studio.data.defaultdataadapter" value="final"/>
	<parameter name="dep_param" class="java.util.List"/>
	<parameter name="min_sal" class="java.lang.Double"/>
	<parameter name="max_sal" class="java.lang.Double"/>
	<queryString language="SQL">
		<![CDATA[SELECT Employee_ID,
	Employee_Name, Department,
	Salary_KSH, Hire_Date,
	Address,
	Contact_Information
FROM employee_details WHERE ($X{IN , Department , dep_param } )

AND Salary_KSH >= $P{min_sal} AND Salary_KSH <= $P{max_sal}]]>
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
	<field name="Address" class="java.lang.String">
		<property name="com.jaspersoft.studio.field.name" value="Address"/>
		<property name="com.jaspersoft.studio.field.label" value="Address"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<field name="Contact_Information" class="java.lang.String">
		<property name="com.jaspersoft.studio.field.name" value="Contact_Information"/>
		<property name="com.jaspersoft.studio.field.label" value="Contact_Information"/>
		<property name="com.jaspersoft.studio.field.tree.path" value="employee_details"/>
	</field>
	<variable name="CalculateBonus" class="java.lang.Double" resetType="None" calculation="Sum">
		<variableExpression><![CDATA[$F{Salary_KSH} * 0.1]]></variableExpression>
	</variable>
	<group name="Employee_ID">
		<groupExpression><![CDATA[$F{Employee_ID}]]></groupExpression>
	</group>
	<group name="Employee_Name">
		<groupExpression><![CDATA[$F{Employee_Name}]]></groupExpression>
	</group>
	<group name="Department">
		<groupExpression><![CDATA[$F{Department}]]></groupExpression>
	</group>
	<group name="Salary_KSH">
		<groupExpression><![CDATA[$F{Salary_KSH}]]></groupExpression>
	</group>
	<group name="Hire_Date">
		<groupExpression><![CDATA[$F{Hire_Date}]]></groupExpression>
	</group>
	<group name="Address">
		<groupExpression><![CDATA[$F{Address}]]></groupExpression>
	</group>
	<group name="Contact_Information">
		<groupExpression><![CDATA[$F{Contact_Information}]]></groupExpression>
	</group>
	<background>
		<band splitType="Stretch"/>
	</background>
	<title>
		<band height="80" splitType="Stretch">
			<staticText>
				<reportElement x="124" y="17" width="307" height="46" uuid="99f37f5f-e41e-4987-a9a9-b07dbf43a719"/>
				<textElement textAlignment="Center" verticalAlignment="Middle">
					<font fontName="Old English Text MT" size="37"/>
				</textElement>
				<text><![CDATA[The Time Company]]></text>
			</staticText>
			<staticText>
				<reportElement x="498" y="25" width="46" height="31" uuid="a7eba132-19ec-44ef-b051-1c6177555c0a"/>
				<textElement textAlignment="Right">
					<font size="8"/>
				</textElement>
				<text><![CDATA[Nariobi, Kenya
12345-00100
time@co.ke]]></text>
			</staticText>
			<image>
				<reportElement x="10" y="15" width="50" height="50" uuid="5dceebbc-a728-4796-ab96-258e6af3eba6"/>
				<imageExpression><![CDATA["time.jpg"]]></imageExpression>
			</image>
		</band>
	</title>
	<pageHeader>
		<band height="10" splitType="Stretch">
			<property name="com.jaspersoft.studio.layout" value="com.jaspersoft.studio.editor.layout.grid.JSSGridBagLayout"/>
			<property name="com.jaspersoft.studio.unit.height" value="px"/>
		</band>
	</pageHeader>
	<columnHeader>
		<band height="30" splitType="Stretch">
			<staticText>
				<reportElement mode="Opaque" x="0" y="0" width="111" height="30" backcolor="#4EED66" uuid="09e298f6-37a9-40b1-b2bd-5a025b76f4d9">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="2b81a415-3785-48b6-85b1-cec9588ec8bf"/>
					<property name="com.jaspersoft.studio.unit.width" value="px"/>
					<property name="com.jaspersoft.studio.unit.height" value="px"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left">
					<font size="12" isBold="true"/>
				</textElement>
				<text><![CDATA[Employee ID]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="111" y="0" width="111" height="30" backcolor="#4EED66" uuid="e9a3c934-1b5a-4f96-98b0-896744777564">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="671bd416-eb9f-4639-88c9-a8a4e46cedc9"/>
					<property name="com.jaspersoft.studio.unit.width" value="px"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement textAlignment="Left">
					<font size="12" isBold="true"/>
				</textElement>
				<text><![CDATA[Employee Name]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="222" y="0" width="111" height="30" backcolor="#4EED66" uuid="c573c698-fddd-4cee-b73e-a1d3da9350dc">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="b62d215a-a206-4ed9-88a5-f84cbf01a540"/>
					<property name="com.jaspersoft.studio.unit.width" value="px"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement>
					<font size="12" isBold="true"/>
				</textElement>
				<text><![CDATA[Department]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="333" y="0" width="111" height="30" backcolor="#4EED66" uuid="128ff369-c0dd-4c98-9ebb-6ea16974edaf">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="9af8b06b-d854-45d2-a13f-4131228b07d9"/>
					<property name="com.jaspersoft.studio.unit.width" value="px"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement>
					<font size="12" isBold="true"/>
				</textElement>
				<text><![CDATA[Salary in KSH]]></text>
			</staticText>
			<staticText>
				<reportElement mode="Opaque" x="444" y="0" width="111" height="30" backcolor="#4EED66" uuid="a4265df5-1ddc-4061-b115-2feb679249e7">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="81f80028-a6d6-477c-a16d-dcdac995db19"/>
					<property name="com.jaspersoft.studio.unit.width" value="px"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
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
		<band height="60" splitType="Stretch">
			<textField>
				<reportElement x="0" y="0" width="111" height="30" uuid="eb33c618-62c9-4826-a3e6-15b9fb11cb3a">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="2b81a415-3785-48b6-85b1-cec9588ec8bf"/>
					<property name="com.jaspersoft.studio.unit.width" value="px"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textFieldExpression><![CDATA[$F{Employee_ID}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="111" y="0" width="111" height="30" uuid="eba5a72b-7e91-4a7f-9eb6-974c51745f58">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="671bd416-eb9f-4639-88c9-a8a4e46cedc9"/>
					<property name="com.jaspersoft.studio.unit.width" value="px"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textFieldExpression><![CDATA[$F{Employee_Name}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="222" y="0" width="111" height="30" uuid="3346380d-713b-4835-a02c-b7741809e976">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="b62d215a-a206-4ed9-88a5-f84cbf01a540"/>
					<property name="com.jaspersoft.studio.unit.width" value="px"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textFieldExpression><![CDATA[$F{Department}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="333" y="0" width="111" height="30" uuid="87c4f1ad-0cff-45e7-9692-a02479e579ba">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="9af8b06b-d854-45d2-a13f-4131228b07d9"/>
					<property name="com.jaspersoft.studio.unit.width" value="px"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textFieldExpression><![CDATA[$F{Salary_KSH}]]></textFieldExpression>
			</textField>
			<textField pattern="dd/MM/YYYY">
				<reportElement x="444" y="0" width="111" height="30" uuid="576bf7b6-4bc9-4ac0-b71b-2c765a9e86fe">
					<property name="com.jaspersoft.studio.spreadsheet.connectionID" value="81f80028-a6d6-477c-a16d-dcdac995db19"/>
					<property name="com.jaspersoft.studio.unit.width" value="px"/>
				</reportElement>
				<box>
					<pen lineWidth="0.05"/>
					<topPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.05" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textFieldExpression><![CDATA[$F{Hire_Date}]]></textFieldExpression>
			</textField>
			<subreport>
				<reportElement mode="Opaque" x="-2" y="30" width="557" height="29" backcolor="#A0C6F2" uuid="bda6a6dc-b23e-4ecb-af89-49ba3d5a4a35"/>
				<connectionExpression><![CDATA[$P{REPORT_CONNECTION}]]></connectionExpression>
				<subreportExpression><![CDATA["EmployeeDetailsSubreport.jasper"]]></subreportExpression>
			</subreport>
			<textField>
				<reportElement x="330" y="30" width="110" height="30" uuid="3bdbd626-0c37-4424-8eb7-23c72bc03b15"/>
				<textElement verticalAlignment="Middle"/>
				<textFieldExpression><![CDATA[$V{CalculateBonus}]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement x="220" y="29" width="110" height="30" uuid="3a21f979-e9c1-45a2-ada2-1d0e02bcb553"/>
				<box>
					<topPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<leftPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<bottomPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
					<rightPen lineWidth="0.0" lineStyle="Solid" lineColor="#000000"/>
				</box>
				<textElement verticalAlignment="Middle">
					<font isBold="true"/>
				</textElement>
				<text><![CDATA[Bonus Amount]]></text>
			</staticText>
		</band>
	</detail>
	<columnFooter>
		<band height="45" splitType="Stretch"/>
	</columnFooter>
	<pageFooter>
		<band height="54" splitType="Stretch"/>
	</pageFooter>
	<summary>
		<band height="52" splitType="Stretch">
			<staticText>
				<reportElement x="168" y="10" width="218" height="30" uuid="548d93bc-1a4c-491f-9925-8c4571d6d050"/>
				<textElement textAlignment="Center" verticalAlignment="Middle">
					<font isBold="true"/>
				</textElement>
				<text><![CDATA[****** THIS IS THE LAST PAGE ******]]></text>
			</staticText>
		</band>
	</summary>
</jasperReport>
