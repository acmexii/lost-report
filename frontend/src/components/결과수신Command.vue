<template>
    <v-card outlined>
        <v-card-title>
            결과수신
        </v-card-title>

        <v-card-text>
            <String label="ClaimId" v-model="value.claimId" :editMode="editMode"/>
            <String label="ReviewRslt" v-model="value.reviewRslt" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="결과수신"
            >
                결과수신
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
        name: '결과수신Command',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.claimId = '';
            this.value.reviewRslt = '';
        },
        watch: {
        },
        methods: {
            결과수신() {
                this.$emit('결과수신', this.value);
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

