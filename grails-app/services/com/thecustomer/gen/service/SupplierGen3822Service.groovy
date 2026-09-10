// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen3822Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 3500 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence1() { return 8353 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 4146 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 5322 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 3462 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 5321 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice6() { return 9410 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 2587 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 2260 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn9() { return 5074 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence10() { return 8379 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId11() { return 7588 }
    /** Derived accessor for category (generated filler). */
    def computeCategory12() { return 911 }
    /** Derived accessor for category (generated filler). */
}
