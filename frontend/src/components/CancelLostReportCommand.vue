<template>
    <v-card outlined>
        <v-card-title>
            CancelLostReport
        </v-card-title>

        <v-card-text>
            <Number label="Id" v-model="value.id" :editMode="editMode"/>
            <Number label="UserId" v-model="value.userId" :editMode="editMode"/>
            <String label="UserName" v-model="value.userName" :editMode="editMode"/>
            <String label="PhoneNumber" v-model="value.phoneNumber" :editMode="editMode"/>
            <String label="PlazaId" v-model="value.plazaId" :editMode="editMode"/>
            <Number label="ManagerId" v-model="value.managerId" :editMode="editMode"/>
            <Boolean label="CallForwarded" v-model="value.callForwarded" :editMode="editMode"/>
            <String label="ForwardPhoneNumber" v-model="value.forwardPhoneNumber" :editMode="editMode"/>
            <Date label="LostDate" v-model="value.lostDate" :editMode="editMode"/>
            <String label="Status" v-model="value.status" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="cancelLostReport"
            >
                CancelLostReport
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CancelLostReportCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.id = 0;
            this.value.userId = 0;
            this.value.userName = '';
            this.value.phoneNumber = '';
            this.value.plazaId = '';
            this.value.managerId = 0;
            this.value.callForwarded = false;
            this.value.forwardPhoneNumber = '';
            this.value.lostDate = '2025-03-06';
            this.value.status = '';
        },
        watch: {
        },
        methods: {
            cancelLostReport() {
                this.$emit('cancelLostReport', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

